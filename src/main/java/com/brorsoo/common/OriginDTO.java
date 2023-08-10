package com.brorsoo.common;

public class OriginDTO {
    private int originCode;
    private String originName;
    private String beanKind;
    private BeanDTO beanList;

    public OriginDTO() { }

    public OriginDTO(int originCode, String originName, String beanKind, BeanDTO beanList) {
        this.originCode = originCode;
        this.originName = originName;
        this.beanKind = beanKind;
        this.beanList = beanList;
    }

    public int getOriginCode() {
        return originCode;
    }

    public void setOriginCode(int originCode) {
        this.originCode = originCode;
    }

    public String getOriginName() {
        return originName;
    }

    public void setOriginName(String originName) {
        this.originName = originName;
    }

    public String getBeanKind() {
        return beanKind;
    }

    public void setBeanKind(String beanKind) {
        this.beanKind = beanKind;
    }

    public BeanDTO getBeanList() {
        return beanList;
    }

    public void setBeanList(BeanDTO beanList) {
        this.beanList = beanList;
    }

    @Override
    public String toString() {
        return "OriginDTO{" +
                "originCode=" + originCode +
                ", originName='" + originName + '\'' +
                ", beanKind='" + beanKind + '\'' +
                ", beanList=" + beanList +
                '}';
    }
}
