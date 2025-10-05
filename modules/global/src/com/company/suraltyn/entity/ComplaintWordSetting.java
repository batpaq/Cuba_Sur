package com.company.suraltyn.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.BaseUuidEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@NamePattern("%s|word")
@Table(name = "COMPLAINT_WORD_SETTING")
@Entity(name = "ComplaintWordSetting")
public class ComplaintWordSetting extends BaseUuidEntity {
    private static final long serialVersionUID = -8328223351082066826L;

    @Lob
    @Column(name = "WORD")
    private String word;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "COMPLAINT_REASON_ID", nullable = false)
    private ComplaintReason complaintReason;

    @NotNull
    @Column(name = "SIGN", nullable = false)
    private String sign;

    public ComplaintSign getSign() {
        return sign == null ? null : ComplaintSign.fromId(sign);
    }

    public void setSign(ComplaintSign sign) {
        this.sign = sign == null ? null : sign.getId();
    }

    public ComplaintReason getComplaintReason() {
        return complaintReason;
    }

    public void setComplaintReason(ComplaintReason complaintReason) {
        this.complaintReason = complaintReason;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
}
