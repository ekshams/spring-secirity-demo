package com.eliks.springsecuritydemo.model;

public class Account {
    String accountId;
    String accountType;
    String customerId;

    public Account(String accountId, String accountType, String customerId) {
        this.accountId = accountId;
        this.accountType = accountType;
        this.customerId = customerId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
}
