package com.payspec.domain.model.identity;

import javax.persistence.*;
import java.util.Date;

@Table(name = "identities")
@Entity(name = "AbstractIdentity")
@DiscriminatorColumn(name = "class")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class AbstractIdentity extends BaseIdentity {

    @Column(name = "user_id")
    private String userId;

    @Column(name = "organization_id")
    private String organizationId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "profile_picture")
    private String profilePicture;

    public AbstractIdentity() {
        super();
    }

    public AbstractIdentity(Long id, String userId, String userName, Date created) {
        super(id, userName);
        this.userId = userId;
        setCreated(created);
    }

    public AbstractIdentity(String username) {
        super(username);
    }

    public Long getId() {
        return super.getId();
    }

    public void setId(Long id) {
        super.setId(id);
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }
}
