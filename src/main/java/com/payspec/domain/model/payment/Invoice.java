package com.payspec.domain.model.payment;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity(name = "Invoice")
@DiscriminatorValue(value = "2")
public class Invoice extends AbstractPayment {


}
