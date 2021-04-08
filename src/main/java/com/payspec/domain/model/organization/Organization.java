package com.payspec.domain.model.organization;

import com.payspec.domain.api.IOrganization;
import com.payspec.domain.model.user.UserIdentity;

import javax.persistence.*;

@Entity(name="Organization")
@Table(name="Organizations")
@DiscriminatorValue(value = "ORG")
public class Organization extends NamedEntity implements IOrganization {

    @OneToOne
    private UserIdentity userIdentity;

    @Override
    public String getEmail() {
        return null;
    }

    @Override
    public void setEmail(String Email) {

    }

    public UserIdentity getUserIdentity() {
        return userIdentity;
    }

    public void setUserIdentity(UserIdentity userIdentity) {
        this.userIdentity = userIdentity;
    }
}
