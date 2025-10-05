package com.company.suraltyn.service;

import com.company.suraltyn.entity.Complaint;
import com.company.suraltyn.entity.ComplaintSign;

public interface ComplaintAnalysisService {
    String NAME = "suraltyn_ComplaintAnalysisService";

    void analyzeComplaint(Complaint complaint);

    void toggleWordAnalysis(Complaint complaint);

    ComplaintSign detectSign(Complaint complaint);
}