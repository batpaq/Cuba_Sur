package com.company.suraltyn.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@NamePattern("%s|name")
@Table(name = "CHANNEL")
@Entity(name = "suraltyn$Channel")
public class Channel extends StandardEntity {
    private static final long serialVersionUID = -7920092946126543806L;

    @Column(name = "CODE")
    private Integer code;

    @Column(name = "NAME", length = 1024)
    private String name;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}