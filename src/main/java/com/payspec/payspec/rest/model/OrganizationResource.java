package com.payspec.payspec.rest.model;

import com.payspec.payspec.domain.api.IOrganization;

import java.util.Collection;
import java.util.HashSet;

public class OrganizationResource extends DefaultResource implements IOrganization {

	private String name;

	private String email;

	private String phoneNumber;

	private Collection<ProductResource> products = new HashSet<ProductResource>();

	public OrganizationResource() {
		super();
	}

	public OrganizationResource(IOrganization organization) {
		this.name = organization.getName();
		this.email = organization.getEmail();
		this.phoneNumber = organization.getPhoneNumber();
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getEmail() {
		return email;
	}

	@Override
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String getPhoneNumber() {
		return phoneNumber;
	}

	@Override
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Collection<ProductResource> getProducts() {
		return products;
	}

	public void setProducts(Collection<ProductResource> products) {
		this.products = products;
	}

}
