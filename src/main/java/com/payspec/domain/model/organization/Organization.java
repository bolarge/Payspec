package com.payspec.domain.model.organization;

import com.payspec.domain.api.IOrganization;

import javax.persistence.*;

@Entity(name="Organization")
@DiscriminatorValue(value = "ORG")
public class Organization implements IOrganization {

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public String getEmail() {
        return null;
    }

    @Override
    public void setEmail(String Email) {

    }
}
