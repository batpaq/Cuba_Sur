package com.company.suraltyn.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "RATING")
@Entity(name = "Rating")
@NamePattern("%s|name")
public class Rating extends StandardEntity {
    private static final long serialVersionUID = -5052031399779551824L;
    @Column(name = "CODE")
    private Integer code;
    @Column(name = "NAME", length = 4000)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}