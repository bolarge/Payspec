package com.payspec.domain.model.authority;

import com.payspec.domain.model.organization.NamedEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name="Role")
@Table(name="roles")
public class Role extends NamedEntity {


}
