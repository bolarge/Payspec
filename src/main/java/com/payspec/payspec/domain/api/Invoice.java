package com.payspec.payspec.domain.api;

import java.util.Collection;

public interface Invoice<T extends IProduct>{

	Collection<T> getProducts();

	void setProducts(Collection<T> products);

}
