package com.payspec.payspec.service.service;

import com.quatspec.api.exception.QuaspecServiceException;
import com.quatspec.api.model.IInvoice;
import com.quatspec.api.model.IPayment;

import java.util.List;

public interface IPaymentService {
	
	List<? extends IPayment> getAll() throws QuaspecServiceException;
	
	List<? extends IPayment> getByIUser(String username) throws QuaspecServiceException;
	
	IPayment get(String username) throws QuaspecServiceException;
	
	IPayment processPayment(IPayment iPayment) throws QuaspecServiceException;

	IInvoice generateInvoice(IInvoice iProductInvoice);

}
