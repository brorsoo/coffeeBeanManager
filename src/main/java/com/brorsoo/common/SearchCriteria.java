package com.brorsoo.common;

public class SearchCriteria {

    private String condition;
    private String value;

    private int code;
    private int count;

    public SearchCriteria() { }

    public SearchCriteria(String condition, String value) {
        this.condition = condition;
        this.value = value;
    }

    public SearchCriteria(String condition, int code, int count) {
        this.condition = condition;
        this.code = code;
        this.count = count;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "SearchCriteria{" +
                "condition='" + condition + '\'' +
                ", value='" + value + '\'' +
                ", code=" + code +
                ", count=" + count +
                '}';
    }
}
