package com.payspec.service;

import com.payspec.domain.api.IPayment;
import com.payspec.domain.api.Invoice;

import java.util.List;

public interface PaymentService {

	List<? extends IPayment> getAll();

	List<? extends IPayment> getByIUser(String username) ;

	IPayment get(String username);

	IPayment processPayment(IPayment iPayment) ;

	Invoice generateInvoice(Invoice iProductInvoice);
}
