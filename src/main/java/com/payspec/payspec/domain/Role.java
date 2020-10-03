package com.payspec.payspec.domain;

import com.payspec.payspec.domain.base.NamedEntity;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity(name="Role")
@Table(name="role")
@NamedQueries({
        @NamedQuery(name = "Role.findAll", query = "SELECT r FROM Role r"),
        @NamedQuery(name="Role.findAllByName", query="select r from Role r where LOWER(r.name)=:NAME")})
public class Role extends NamedEntity {


}
