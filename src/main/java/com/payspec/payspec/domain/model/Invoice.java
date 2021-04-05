package com.payspec.payspec.domain.model;

import com.payspec.payspec.domain.AbstractPayment;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity(name = "Invoice")
@DiscriminatorValue(value = "2")
public class Invoice extends AbstractPayment {


}
