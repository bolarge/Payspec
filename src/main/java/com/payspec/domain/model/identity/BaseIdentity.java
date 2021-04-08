package com.payspec.domain.model.identity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.payspec.domain.api.IIdentity;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@MappedSuperclass
public class BaseIdentity implements IIdentity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO, generator="native")
    @GenericGenerator(name = "native", strategy = "native")
    private Long id;

    @Column(name = "email")
    private String email;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "password", length = 999)
    private String password;

    @Column(name="created")
    @Temporal(TemporalType.DATE)
    private Date created;

    @Column(name="changedBy")
    private String changedBy;

    @Column(name = "version")
    private int version;

    public BaseIdentity() {}

    public BaseIdentity(Long id) {
        this.id = id;
    }

    public BaseIdentity(String userName){ this.userName = userName; }

    public BaseIdentity(Long id, String userName){
        this(id);
        this.userName = userName;
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String username) {
        this.userName = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
