package com.payspec.domain.model.payment;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.payspec.domain.BaseEntity;
import com.payspec.domain.model.product.Good;
import com.payspec.domain.enums.PaymentStatus;
import com.payspec.domain.enums.PaymentType;
import com.payspec.domain.model.user.AbstractUser;

@Entity(name = "PaymentParent")
@Table(name = "payment")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "p_type")
public abstract class AbstractPayment extends BaseEntity {

	@Column(name = "payment_id")
	protected String paymentId;

	@Column(name = "amount")
	protected BigDecimal amount;

	@Column(name = "payment_charge")
	protected Double paymentCharge;

	@Column(name = "payment_description")
	protected String paymentDescription;

	@Column(name = "payment_date")
	protected Date paymentDate;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "buyer_id")
	protected AbstractUser buyer;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "seller")
	protected AbstractUser seller;

	@Enumerated(EnumType.STRING)
	protected PaymentStatus paymentStatus;

	@Enumerated(EnumType.STRING)
	protected PaymentType paymentType;

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "payment_product_association",
			joinColumns = @JoinColumn(name = "payment_id"),
			inverseJoinColumns = @JoinColumn(name="product_id"))
	protected Collection<Good> products = new ArrayList<Good>();

	public AbstractUser getBuyer() {
		return buyer;
	}

	public void setBuyer(AbstractUser buyer) {
		this.buyer = buyer;
	}

	public AbstractUser getSeller() {
		return seller;
	}

	public void setSeller(AbstractUser seller) {
		this.seller = seller;
	}

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

	public String getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}

	public Double getPaymentCharge() {
		return paymentCharge;
	}

	public void setPaymentCharge(Double paymentCharge) {
		this.paymentCharge = paymentCharge;
	}

	public Collection<Good> getProducts() {
		return products;
	}

	public void setProducts(Collection<Good> products) {
		this.products = products;
	}

	public PaymentType getPaymentType() {
		return paymentType;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((paymentId == null) ? 0 : paymentId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AbstractPayment other = (AbstractPayment) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (paymentId == null) {
			if (other.paymentId != null)
				return false;
		} else if (!paymentId.equals(other.paymentId))
			return false;
		return true;
	}

}
