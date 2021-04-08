package com.payspec.domain.model.organization;

import com.payspec.domain.model.organization.Identity;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class NamedEntity extends Identity {

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name="status")
    protected boolean status = false;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "NamedEntity{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
