package com.payspec.payspec.domain.base;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name = "Category")
@Table(name = "category")
public class Category extends NamedEntity{
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="category", cascade=CascadeType.ALL, orphanRemoval=true)
	protected Set<SubCategory> subCategories = new HashSet<SubCategory>();

	public Set<SubCategory> getSubCategories() {
		return subCategories;
	}

	public void setSubCategories(Set<SubCategory> subCategories) {
		this.subCategories = subCategories;
	}

}
