package com.payspec.payspec.service.api.service;

import com.payspec.payspec.service.api.exception.QuaspecServiceException;
import com.payspec.payspec.service.api.model.IInvoice;
import com.payspec.payspec.service.api.model.IPayment;

import java.util.List;

public interface IPaymentService {
	
	List<? extends IPayment> getAll() throws QuaspecServiceException;
	
	List<? extends IPayment> getByIUser(String username) throws QuaspecServiceException;
	
	IPayment get(String username) throws QuaspecServiceException;
	
	IPayment processPayment(IPayment iPayment) throws QuaspecServiceException;

	IInvoice generateInvoice(IInvoice iProductInvoice);

}
