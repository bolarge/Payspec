package com.payspec.payspec.service.api.model;

import java.util.Collection;

public interface Payable<Product> {

	Collection<Product> getProducts();
	
	//void setProducts(Collection<Product> product);
}
