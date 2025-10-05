package com.company.suraltyn.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@NamePattern("%s|name")
@Table(name = "SOURCE_DICTIONARY")
@Entity(name = "suraltyn$SourceDictionary")
public class SourceDictionary extends StandardEntity {
    private static final long serialVersionUID = -1234567890123456797L;

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sourceDictionaryNumberGenerator")
    @SequenceGenerator(name = "sourceDictionaryNumberGenerator", sequenceName = "sourceDictionary_number_seq", allocationSize = 1)
    @Column(name = "CODE")
    private Integer code;

    @NotNull
    @Column(name = "NAME", nullable = false, length = 4555)
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