package com.payspec.payspec.domain;

import java.util.Collection;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import com.payspec.payspec.domain.base.Product;
import com.payspec.payspec.service.api.model.IProduct;

@Entity(name = "Service")
@DiscriminatorValue(value = "2")
public class Service extends Product implements IProduct {

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
