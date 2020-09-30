/*
package com.payspec.payspec.domain;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import java.util.Set;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

i

@Entity(name = "Invoice")
@DiscriminatorValue(value = "2")
public class Invoice extends Payment  {//implements  IInvoice<Product>
	
	public Invoice() {
		super();
	}

	public Invoice(String paymentId, BigDecimal amount, Double paymentCharge, String paymentDescription,
			Collection<Product> products, Date paymentDate, User paychant, User merchant, PaymentType paymentType,
			PaymentStatus paymentStatus) {
		super(paymentId, amount, paymentCharge, paymentDescription, products, paymentDate, paychant, merchant, paymentType,
				paymentStatus);		
	}

	public Invoice(String paymentId, BigDecimal amount, String paymentDescription, User paychant, User merchant,
			PaymentType paymentType, PaymentStatus paymentStatus) {
		super(paymentId, amount, paymentDescription, paychant, merchant, paymentType, paymentStatus);		
	}
	
	
	
}
*/
