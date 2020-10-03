package com.payspec.payspec.service.api.service;

import com.payspec.payspec.service.api.exception.QuaspecServiceException;
import com.payspec.payspec.service.api.model.IProduct;

import java.util.List;

public interface IProductService {

List<? extends IProduct> getAll() throws QuaspecServiceException;
	
	List<? extends IProduct> getByIOrganization(String username) throws QuaspecServiceException;
	
	IProduct get(String name) throws QuaspecServiceException;
	
	IProduct createProduct(IProduct iProduct) throws QuaspecServiceException;
}
