package com.payspec.service;

import com.payspec.domain.api.IProduct;
import com.payspec.domain.exception.QuaspecServiceException;

import java.util.List;

public interface ProductService {

List<? extends IProduct> getAll() throws QuaspecServiceException;

	List<? extends IProduct> getByIOrganization(String username) throws QuaspecServiceException;

	IProduct get(String name) throws QuaspecServiceException;

	IProduct createProduct(IProduct iProduct) throws QuaspecServiceException;
}
