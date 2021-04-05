package com.payspec.payspec.service;

import com.payspec.payspec.domain.api.IPayment;
import com.payspec.payspec.domain.exception.QuaspecServiceException;
import com.payspec.payspec.domain.api.Invoice;

import java.util.List;

public interface PaymentService {

	List<? extends IPayment> getAll() throws QuaspecServiceException;

	List<? extends IPayment> getByIUser(String username) throws QuaspecServiceException;

	IPayment get(String username) throws QuaspecServiceException;

	IPayment processPayment(IPayment iPayment) throws QuaspecServiceException;

	Invoice generateInvoice(Invoice iProductInvoice);

}
