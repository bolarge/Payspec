package com.payspec.domain.model.user;

import com.payspec.domain.model.identity.BaseIdentity;
import com.payspec.domain.model.organization.registration.request.RegistrationRequest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class UserCreationRequest extends BaseIdentity {

    protected String organizationID;
    protected String email;
    protected String firstName;
    protected String lastName;
    protected String companyName;
    protected String password;
    protected String[] roles;
    protected boolean sendEmail = false;
    protected boolean userPresent = false;

    @XmlTransient protected String bfOrganizationID;

    public UserCreationRequest() {}

    public UserCreationRequest(RegistrationRequest request, String organizationID) {
        this.organizationID = organizationID;
        this.firstName = request.getFirstName();
        this.lastName = request.getLastName();
        this.companyName = request.getCompanyName();
        this.email = request.getEmail();
        this.password = request.getPassword();
        this.sendEmail = request.getSendEmail();
        this.userPresent = true;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public Boolean isSendEmail() {
        return sendEmail;
    }

    public void setSendEmail(boolean sendEmail) {
        this.sendEmail = sendEmail;
    }

    public boolean isUserPresent() {
        return userPresent;
    }

    public void setUserPresent(boolean userPresent) {
        this.userPresent = userPresent;
    }

    public String getBfOrganizationID() {
        return bfOrganizationID;
    }

    public void setBfOrganizationID(String bfOrganizationID) {
        this.bfOrganizationID = bfOrganizationID;
    }
}
