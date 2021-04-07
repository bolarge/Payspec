package com.payspec.domain.api;

import java.util.Collection;

public interface Payable<Product> {

	Collection<Product> getProducts();

	//void setProducts(Collection<Product> product);
}
