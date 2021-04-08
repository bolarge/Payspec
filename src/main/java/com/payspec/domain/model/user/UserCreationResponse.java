package com.payspec.domain.model.user;

import com.payspec.domain.model.identity.BaseIdentity;

public class UserCreationResponse extends BaseIdentity {

    protected String organizationID;
    protected String email;
    protected String firstName;
    protected String lastName;
    protected String companyName;
    protected String[] roles;
    protected boolean emailSent = false;

    protected String bfOrganizationID;

    public String accountID;
    //protected Account account;
    protected User user;
    protected UserCreationRequest request;

    public UserCreationResponse() {}

/*    public UserCreationResponse(UserCreationRequest request, User user, Account account) {
        this.account = account;
        this.user = user;
        this.request = request;
        accountID = account.getID();
        organizationID = request.getOrganizationID();
        email = request.getEmail();
        firstName = request.getFirstName();
        lastName = request.getLastName();
        companyName = request.getCompanyName();
        emailSent = request.isSendEmail();
        this.roles = request.getRoles();
    }*/

    public String getAccountID() {
        return accountID;
    }

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    public String getOrganizationID() {
        return organizationID;
    }

    public void setOrganizationID(String organizationID) {
        this.organizationID = organizationID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getID() {
        return null;
    }

    public String[] getRoles() {
        return roles;
    }

    public void setRoles(String[] roles) {
        this.roles = roles;
    }

    public boolean isEmailSent() {
        return emailSent;
    }

    public void setEmailSent(boolean emailSent) {
        this.emailSent = emailSent;
    }

    public String getBfOrganizationID() {
        return bfOrganizationID;
    }

    public void setBfOrganizationID(String bfOrganizationID) {
        this.bfOrganizationID = bfOrganizationID;
    }

/*    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }*/

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public UserCreationRequest getRequest() {
        return request;
    }

    public void setRequest(UserCreationRequest request) {
        this.request = request;
    }
}
