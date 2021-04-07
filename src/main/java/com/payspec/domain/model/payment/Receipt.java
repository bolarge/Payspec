package com.payspec.domain.model.payment;

import com.payspec.domain.api.IPayment;
import com.payspec.domain.enums.PaymentStatus;
import com.payspec.domain.enums.PaymentType;
import com.payspec.domain.model.product.Good;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;

@Entity(name = "Payment")
@DiscriminatorValue(value = "1")
public class Receipt extends AbstractPayment implements IPayment {

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getPaymentDescription() {
		return paymentDescription;
	}

	public void setPaymentDescription(String paymentDescription) {
		this.paymentDescription = paymentDescription;
	}

	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public PaymentStatus getPaymentStatus() {
		return paymentStatus;
	}

	public PaymentType getPaymentType() {
		return paymentType;
	}

	@Override
	public Collection<Good> getProducts() {
		return super.getProducts();
	}

	@Override
	public void setProducts(Collection<Good> products) {
		super.setProducts(products);
	}


}
