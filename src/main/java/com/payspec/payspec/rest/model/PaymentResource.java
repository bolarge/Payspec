/*
package com.payspec.payspec.rest.model;

import com.payspec.payspec.domain.api.IPayment;
import com.payspec.payspec.domain.api.Payable;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class PaymentResource extends DefaultResource implements IPayment, Payable {

	private BigDecimal amount;

	private String paymentDescription;

	private Date paymentDate;

	private UserResource paychant;

	private UserResource merchant;


	public PaymentResource() {
		super();
	}

	public PaymentResource(IPayment iPaymentRequest) {
		this.amount = iPaymentRequest.getAmount();
		this.paymentDescription = iPaymentRequest.getPaymentDescription();
		//this.paymentType = iPaymentRequest.getPaymentType();
	}

	@Override
	public BigDecimal getAmount() {
		return amount;
	}

	@Override
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	@Override
	public String getPaymentDescription() {
		return paymentDescription;
	}

	@Override
	public void setPaymentDescription(String paymentDescription) {
		this.paymentDescription = paymentDescription;
	}

	@Override
	public Date getPaymentDate() {
		return paymentDate;
	}

	@Override
	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	@Override
	public Collection getProducts() {
		return null;
	}
}
*/
