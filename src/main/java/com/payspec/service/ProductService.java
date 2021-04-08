package com.payspec.service;

import com.payspec.domain.api.IProduct;

import java.util.List;

public interface ProductService {

List<? extends IProduct> getAll();

	List<? extends IProduct> getByIOrganization(String username);

	IProduct get(String name);

	IProduct createProduct(IProduct iProduct);
}
