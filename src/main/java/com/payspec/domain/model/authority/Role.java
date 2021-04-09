package com.payspec.domain.model.authority;

import com.payspec.domain.model.organization.NamedEntity;

import javax.persistence.*;
import java.util.Collection;

@Entity(name = "Role")
@Table(name = "roles")
public class Role extends NamedEntity {

    @OneToMany
    @JoinTable(name="role_privilege",
            joinColumns=@JoinColumn(name="role_id"),
            inverseJoinColumns=@JoinColumn(name="prv_id"))
    private Collection<Privilege> privilege;

    public Collection<Privilege> getPrivilege() {
        return privilege;
    }

    public void setPrivilege(Collection<Privilege> privilege) {
        this.privilege = privilege;
    }
}
