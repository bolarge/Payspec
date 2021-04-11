package com.payspec.domain.model.authority;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.payspec.domain.model.organization.NamedEntity;

import javax.persistence.*;
import java.util.Collection;
import java.util.HashSet;

@AttributeOverrides({@AttributeOverride(name = "id", column = @Column(name = "privilege_id"))})
@Table(name = "privileges" /*uniqueConstraints = @UniqueConstraint(columnNames = {"role_id", "privilege_id"})*/)
@Entity(name = "Privilege")
public class Privilege extends NamedEntity {

    @ManyToMany(mappedBy = "privileges")
    private Collection<Role> roles = new HashSet<>();

    public Privilege() {}

    public Collection<Role> getRoles() {
        return roles;
    }

    public void setRoles(Collection<Role> roles) {
        this.roles = roles;
    }
}
