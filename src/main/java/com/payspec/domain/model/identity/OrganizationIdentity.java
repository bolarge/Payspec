package com.payspec.domain.model.identity;

import javax.persistence.DiscriminatorValue;

@DiscriminatorValue(value = "OID")
public class OrganizationIdentity extends Identity {
}
