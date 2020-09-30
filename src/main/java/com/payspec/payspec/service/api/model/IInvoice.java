package com.payspec.payspec.service.api.model;

import java.util.Collection;

public interface IInvoice<T extends IProduct>{
	
	Collection<T> getProducts();
	
	void setProducts(Collection<T> products);

}
