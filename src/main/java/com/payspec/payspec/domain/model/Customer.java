package com.payspec.payspec.domain.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity(name = "Customer")
@DiscriminatorValue(value = "CUS")
public class Customer extends User{

}
