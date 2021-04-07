package com.payspec.domain.model.product;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import com.payspec.domain.api.IProduct;
import com.payspec.domain.model.organization.Organization;

@Entity(name = "Service")
@DiscriminatorValue(value = "2")
public class Service extends AbstractProduct implements IProduct {

	public Organization getOrganization() {
		return organization;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

	@Override
	public String getProductId() {
		return null;
	}

	@Override
	public void setProductId(String productId) {

	}
}
