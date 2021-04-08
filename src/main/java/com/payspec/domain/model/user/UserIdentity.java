package com.payspec.domain.model.user;

import com.payspec.domain.api.IIdentity;
import com.payspec.domain.model.organization.AbstractIdentity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("USD")
public class UserIdentity extends AbstractIdentity implements IIdentity {

}
