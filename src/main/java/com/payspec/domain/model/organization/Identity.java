package com.payspec.domain.model.organization;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@MappedSuperclass
public class Identity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO, generator="native")
    @GenericGenerator(name = "native", strategy = "native")
    private Long id;

    @Column(name = "email")
    private String email;

    @Column(name="created")
    @Temporal(TemporalType.DATE)
    private Date created;

    @Column(name="changedBy")
    private String changedBy;

    @Column(name = "version")
    private int version;

    public Identity() {}

    public Identity(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @JsonIgnore
    public boolean isNew() {
        return this.id == null;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getChangedBy() {
        return changedBy;
    }

    public void setChangedBy(String changedBy) {
        this.changedBy = changedBy;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }
}
