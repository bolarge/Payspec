package com.payspec.domain.model.identity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("UID")
public class UserIdentity extends Identity {

}
