package com.coding.datamodel;

public class Custmoter {
    private String name;
    private CustomerLevel customerLevel;
    private String cardNo;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CustomerLevel getCustomerLevel() {
        return customerLevel;
    }

    public void setCustomerLevel(CustomerLevel customerLevel) {
        this.customerLevel = customerLevel;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }
}
