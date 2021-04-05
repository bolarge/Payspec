package com.payspec.payspec.rest.model;

import com.payspec.payspec.domain.api.IProduct;

import java.util.ArrayList;
import java.util.Collection;

public class ProductResource extends DefaultResource implements IProduct {

	private String productId;

	private String name;

	private String description;

	private Integer productClass;

	private Collection<ProductResource> products = new ArrayList<ProductResource>();

	private OrganizationResource organization;

	public ProductResource() {
		super();
	}

	public ProductResource(IProduct product) {
		this.productId = product.getProductId();
		this.name = product.getName();
		this.description = product.getDescription();
	}

	@Override
	public String getProductId() {
		return productId;
	}

	@Override
	public void setProductId(String productId) {
		this.productId = productId;
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
	public String getDescription() {
		return description;
	}

	@Override
	public void setDescription(String description) {
		this.description = description;
	}

}
