package com.payspec.domain.model.user;

import com.payspec.domain.model.organization.Identity;
import io.swagger.annotations.ApiModel;
import javax.persistence.*;
import java.util.Date;

@Table(name = "UserIdentities")
@Entity(name = "UserIdentity")
@ApiModel(value = "UserIdentity", description = "UserIdentity")
public class UserIdentity extends Identity {

    @Column(name = "user_id")
    private String userId;

    @Column(name = "password", length = 999)
    private String password;

    @Column(name = "organization_id")
    private String organizationId;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "profile_picture")
    private String profilePicture;

/*    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
            @JoinColumn(
                    name = "user_id",
                    referencedColumnName = "id",
                    insertable = true,
                    updatable = false),
            @JoinColumn(
                    name = "organisation_id",
                    referencedColumnName = "organisation_id",
                    insertable = true,
                    updatable = false)
    })*/
    //private User user;

    public UserIdentity() {
        super();
    }

    public UserIdentity(Long id, String userId, String userName, Date created) {
        super(id);
        this.userId = userId;
        this.userName = userName;
        setCreated(created);
    }

    public UserIdentity(String username) {
        this.userName = username;
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

 /*   public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }*/

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
