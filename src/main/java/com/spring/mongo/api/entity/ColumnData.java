package com.spring.mongo.api.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ColumnData {
    private String id;
    private String label;
    private String placeholder;
    private int maxlength;
    private int minlength;
    private boolean required;
    private boolean disabled;
    private boolean readonly;
    private String value;
}