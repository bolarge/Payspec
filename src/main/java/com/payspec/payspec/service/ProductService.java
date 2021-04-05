package com.payspec.payspec.service;

import com.payspec.payspec.domain.api.IProduct;
import com.payspec.payspec.domain.exception.QuaspecServiceException;

import java.util.List;

public interface ProductService {

List<? extends IProduct> getAll() throws QuaspecServiceException;

	List<? extends IProduct> getByIOrganization(String username) throws QuaspecServiceException;

	IProduct get(String name) throws QuaspecServiceException;

	IProduct createProduct(IProduct iProduct) throws QuaspecServiceException;
}
