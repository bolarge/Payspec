package com.payspec.domain.model.user;

import com.payspec.domain.model.organization.NamedEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name="Role")
@Table(name="role")
public class Role extends NamedEntity {


}
