package com.payspec.domain.model.organization;

import com.payspec.domain.api.IOrganization;
import com.payspec.domain.model.identity.UserIdentity;

import javax.persistence.*;

@Entity(name="Organization")
@Table(name="Organizations")
@DiscriminatorValue("OID")
public class Organization extends AbstractOrganization implements IOrganization {

    @OneToOne
    private UserIdentity userIdentity;

    public UserIdentity getUserIdentity() {
        return userIdentity;
    }

    public void setUserIdentity(UserIdentity userIdentity) {
        this.userIdentity = userIdentity;
    }
}
