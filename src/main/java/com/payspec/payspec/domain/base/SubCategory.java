package com.payspec.payspec.domain.base;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name = "SubCategory")
@Table(name = "sub_category")
public class SubCategory extends NamedEntity implements Comparable<SubCategory>{
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "prod_cat_id")
	protected Category category;
	
	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "subCategories")
	protected Set<Product> products = new HashSet<>();

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Set<Product> getProducts() {
		return products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}

	@Override
	public int compareTo(SubCategory o) {
		int compareId = ((SubCategory) o).getId().intValue();

		return this.getId().intValue() - compareId;
	}
}
