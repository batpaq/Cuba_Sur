package com.company.suraltyn.service;

import com.company.suraltyn.entity.Complaint;
import com.company.suraltyn.entity.ComplaintAnalysisLog;
import com.company.suraltyn.entity.ComplaintSign;
import com.company.suraltyn.entity.ComplaintWordSetting;
import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.core.global.UserSessionSource;
import com.haulmont.cuba.security.entity.User;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.time.LocalDateTime;
import java.util.List;

@Service(ComplaintAnalysisService.NAME)
public class ComplaintAnalysisServiceBean implements ComplaintAnalysisService {

    @Inject
    private DataManager dataManager;

    @Inject
    private UserSessionSource userSessionSource;

    @Override
    public void analyzeComplaint(Complaint complaint) {
        if (complaint == null || Boolean.FALSE.equals(complaint.getWordAnalysisEnabled()))
            return;

        String text = complaint.getReasonForTheComplaint();
        if (text == null || text.trim().isEmpty())
            return;

        text = text.toLowerCase();
        List<ComplaintWordSetting> settings = dataManager.load(ComplaintWordSetting.class).list();

        for (ComplaintWordSetting setting : settings) {
            if (setting.getSign() == ComplaintSign.NO && text.contains(setting.getWord().toLowerCase())) {
                complaint.setComplaintSign(ComplaintSign.NO);
                return;
            }
        }

        for (ComplaintWordSetting setting : settings) {
            if (setting.getSign() == ComplaintSign.YES && text.contains(setting.getWord().toLowerCase())) {
                complaint.setComplaintSign(ComplaintSign.YES);
                return;
            }
        }

        complaint.setComplaintSign(null);
    }

    @Override
    public void toggleWordAnalysis(Complaint complaint) {
        if (complaint == null) return;

        boolean currentState = Boolean.TRUE.equals(complaint.getWordAnalysisEnabled());
        Boolean newState = !currentState;

        complaint.setWordAnalysisEnabled(newState);

        String username = userSessionSource.getUserSession().getUser().getLogin();
        User user = dataManager.load(User.class)
                .query("select u from sec$User u where u.login = :login")
                .parameter("login", username)
                .one();

        ComplaintAnalysisLog log = dataManager.create(ComplaintAnalysisLog.class);
        log.setComplaint(complaint);
        log.setEnabled(newState);
        log.setUser(user);
        log.setTimestamp(LocalDateTime.now());

        dataManager.commit(complaint, log);
    }

    @Override
    public ComplaintSign detectSign(Complaint complaint) {
        return complaint != null ? complaint.getComplaintSign() : null;
    }
}
