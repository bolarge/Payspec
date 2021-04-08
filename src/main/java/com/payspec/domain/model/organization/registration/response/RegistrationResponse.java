package com.payspec.domain.model.organization.registration.response;

import com.payspec.domain.BaseEntity;
import com.payspec.domain.model.organization.registration.request.RegistrationRequest;

public class RegistrationResponse extends BaseEntity {

    private String organizationID;
    private String companyName;
    private String firstName;
    private String lastName;
    private String email;

    public RegistrationResponse() {}

    public RegistrationResponse(RegistrationRequest request, String organizationID) {
        this.organizationID = organizationID;
        this.companyName = request.getCompanyName();
        this.firstName = request.getFirstName();
        this.lastName = request.getLastName();
        this.email = request.getEmail();
    }

    public String getOrganizationID() {
        return organizationID;
    }

    public void setOrganizationID(String organizationID) {
        this.organizationID = organizationID;
    }

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
}
