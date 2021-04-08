package com.payspec.domain.model.organization.registration.request;

import com.payspec.domain.BaseEntity;

public class RegistrationRequest extends BaseEntity {

    protected String email;

    protected String firstName;

    protected String lastName;

    protected String companyName;

    protected String password;

    protected Boolean sendEmail = false;

    protected Integer userLimit;

    public RegistrationRequest() {}

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getSendEmail() {
        return sendEmail;
    }

    public void setSendEmail(Boolean sendEmail) {
        this.sendEmail = sendEmail;
    }

    public Integer getUserLimit() {
        return userLimit;
    }

    public RegistrationRequest setUserLimit(Integer userLimit) {
        this.userLimit = userLimit;
        return this;
    }
}
