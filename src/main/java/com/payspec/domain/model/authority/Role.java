package com.payspec.domain.model.authority;

import com.payspec.domain.model.organization.NamedEntity;
import com.payspec.domain.model.user.User;

import javax.persistence.*;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/*@AttributeOverrides({
        @AttributeOverride(name = "id", column = @Column(name = "role_id", table = "Roles")),
        @AttributeOverride(name = "id", column = @Column(name = "privilege_id", table = "Privileges"))})*/
@Entity(name = "Role")
@Table(name = "roles")
public class Role extends NamedEntity {

    @ManyToMany(mappedBy = "roles")
    private Collection<User> users = new HashSet<>();

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, targetEntity = Privilege.class)
    @JoinTable(name ="role_privilege",
            joinColumns = {@JoinColumn(name = "role_id")},
            inverseJoinColumns = {@JoinColumn(name = "privilege_id")})
    private Set<Privilege> privileges;

    public Set<Privilege> getPrivileges() {
        return privileges;
    }

    public void setPrivileges(Set<Privilege> privileges) {
        this.privileges = privileges;
    }

    public void addPrivilege(String privilegeName) {
        if(this.privileges == null) {
            this.privileges = new HashSet<>();
        }
        Privilege privilege = new Privilege();
        privilege.setName(privilegeName);
        this.privileges.add(privilege);
    }

    public Collection<User> getUsers() {
        return users;
    }

    public void setUsers(Collection<User> users) {
        this.users = users;
    }
}
