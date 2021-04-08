package com.payspec.domain.model.identity;

import javax.persistence.DiscriminatorColumn;

@DiscriminatorColumn(name = "class")
public class Identity extends AbstractIdentity  {
}
