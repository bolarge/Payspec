package com.payspec.payspec.service.service;

import com.quatspec.api.exception.QuaspecServiceException;
import com.quatspec.api.model.IProduct;

import java.util.List;

public interface IProductService {

List<? extends IProduct> getAll() throws QuaspecServiceException;
	
	List<? extends IProduct> getByIOrganization(String username) throws QuaspecServiceException;
	
	IProduct get(String name) throws QuaspecServiceException;
	
	IProduct createProduct(IProduct iProduct) throws QuaspecServiceException;
}
