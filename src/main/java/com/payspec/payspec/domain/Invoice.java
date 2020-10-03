package com.payspec.payspec.domain;

import com.payspec.payspec.domain.base.Payment;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity(name = "Invoice")
@DiscriminatorValue(value = "2")
public class Invoice extends Payment {


}