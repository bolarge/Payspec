package com.payspec.payspec.domain.model;

import com.payspec.payspec.domain.BaseEntity;
import com.payspec.payspec.domain.api.IOrganization;

import java.util.Collection;
import java.util.HashSet;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name="Organization")
@Table(name="organization")
public class Organization extends BaseEntity implements IOrganization {

    @Column(name="name")
    protected String name;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="institution_id")
    protected Institution institution;

    @Column(name="phone_number")
    protected String phoneNumber;

    @Column(name="status")
    protected boolean status = false;

    @OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL, orphanRemoval=true)
    protected Collection<Good> products = new HashSet<Good>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

	public String getEmail() {
		return email;
	}

    public Institution getInstitution() {
        return institution;
    }

    public void setInstitution(Institution institution) {
        this.institution = institution;
    }

    public Collection<Good> getProducts() {
		return products;
	}

	public void setProducts(Collection<Good> products) {
		this.products.addAll(products);
	}

	@Override
    public boolean equals(Object object){
         if(object instanceof Organization && ((Organization)object).getId().equals(this.id)){
             return true;
         }
         return false;
    }

}
