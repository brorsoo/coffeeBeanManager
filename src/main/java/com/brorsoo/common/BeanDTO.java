package com.brorsoo.common;

public class BeanDTO {
    private int beanNo;
    private String beanName;
    private int price;
    private int originCode;
    private String taste;
    private Integer weight;
    private int extraCount;

    public BeanDTO() { }

    public BeanDTO(int beanNo, String beanName, int price, int originCode, String taste, Integer weight, int extraCount) {
        this.beanNo = beanNo;
        this.beanName = beanName;
        this.price = price;
        this.originCode = originCode;
        this.taste = taste;
        this.weight = weight;
        this.extraCount = extraCount;
    }

    public int getBeanNo() {
        return beanNo;
    }

    public void setBeanNo(int beanNo) {
        this.beanNo = beanNo;
    }

    public String getBeanName() {
        return beanName;
    }

    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getOriginCode() {
        return originCode;
    }

    public void setOriginCode(int originCode) {
        this.originCode = originCode;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public int getExtraCount() {
        return extraCount;
    }

    public void setExtraCount(int extraCount) {
        this.extraCount = extraCount;
    }

    @Override
    public String toString() {
        return "BeanDTO{" +
                "beanNo=" + beanNo +
                ", beanName='" + beanName + '\'' +
                ", price=" + price +
                ", originCode=" + originCode +
                ", taste='" + taste + '\'' +
                ", weight=" + weight +
                ", extraCount=" + extraCount +
                '}';
    }
}
