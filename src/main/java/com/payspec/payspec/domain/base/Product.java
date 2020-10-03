package com.payspec.payspec.domain.base;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.payspec.payspec.domain.Organization;

@Entity(name = "Product")
@Table(name = "product")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "p_type")
public abstract class Product extends NamedEntity{

	@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="org_id")
	protected Organization organization;
	
	@ManyToMany(fetch=FetchType.LAZY,targetEntity= SubCategory.class)
    @JoinTable(name="prod_subcat",
            joinColumns =@JoinColumn(name="prod_id"),
            inverseJoinColumns=@JoinColumn(name="prod_subcat_id"))
	protected Set<SubCategory> subCategories = new HashSet<SubCategory>();

	public Organization getOrganization() {
		return organization;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

	public Set<SubCategory> getSubCategories() {
		return subCategories;
	}

	public void setProductSubCategories(Set<SubCategory> subCategories) {
		this.subCategories = subCategories;
	}
}
