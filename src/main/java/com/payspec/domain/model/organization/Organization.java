package com.payspec.domain.model.organization;

import com.payspec.domain.api.IOrganization;

import javax.persistence.*;

@Entity(name="Organization")
@Table(name="Organizations")
@DiscriminatorValue(value = "ORG")
public class Organization extends NamedEntity implements IOrganization {

    @Override
    public String getEmail() {
        return null;
    }

    @Override
    public void setEmail(String Email) {

    }
}
