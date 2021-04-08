package com.payspec.domain.model.organization.request;

import com.payspec.domain.model.organization.Identity;
import com.payspec.domain.model.organization.registration.request.RegistrationRequest;

public class CreateOrganizationRequest extends Identity {

    private String name;

    private Integer userLimit;

    public CreateOrganizationRequest() {}

    public CreateOrganizationRequest(RegistrationRequest request) {
        this.name = request.getCompanyName();
        this.userLimit = request.getUserLimit();
    }

    public CreateOrganizationRequest(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getUserLimit() {
        return userLimit;
    }

    public CreateOrganizationRequest setUserLimit(Integer userLimit) {
        this.userLimit = userLimit;
        return this;
    }
}
