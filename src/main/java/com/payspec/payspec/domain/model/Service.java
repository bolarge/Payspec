package com.payspec.payspec.domain.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import com.payspec.payspec.domain.AbstractProduct;
import com.payspec.payspec.domain.api.IProduct;

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
