package com.payspec.payspec.domain;

import com.payspec.payspec.domain.base.NamedEntity;
import com.payspec.payspec.domain.base.User;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity(name = "Profile")
@Table(name = "profile")
@NamedQueries({
 	@NamedQuery(name="userprofile.findAll", query = "SELECT u FROM Profile u"),
	@NamedQuery(name="userprofile.findProfileByName",query = "select u from Profile as u where LOWER(u.name)=:NAME"),
	@NamedQuery(name="userprofile.findProfileByUserId",query = "select c from Profile as c, User as u where u.id=:USERID and c MEMBER OF u.profiles and c.status=true")
})
public class Profile extends NamedEntity {
	
	@Column(name="base_url")
	protected String baseUrl;
	
	@ManyToMany(mappedBy = "profiles")
	protected Collection<User> users = new HashSet<User>();
	
	@ManyToMany(fetch=FetchType.EAGER,targetEntity = Role.class)
	@JoinTable(name = "profile_role",
			joinColumns = { @JoinColumn(name = "profle_id") },
			inverseJoinColumns = { @JoinColumn(name = "role_id") })
	  private Set<Role> roles = new HashSet<Role>();
	
	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	public String getBaseUrl() {
		return baseUrl;
	}

	public void setBaseUrl(String baseUrl) {
		this.baseUrl = baseUrl;
	}

	public Collection<User> getUsers() {
		return users;
	}

	public void setUsers(Collection<User> users) {
		this.users = users;
	}
	
}
