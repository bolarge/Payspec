/*
package com.payspec.domain.model.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlTransient;
import java.util.Date;

@Table(name = "username")
@Entity(name = "Username")
@ApiModel(value = "Username", description = "Username")
public class Username {

    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "username_guid")
    @ApiModelProperty(value = "{ \"description\" : \"id of the username.\", \"verbs\":[\"POST\",\"PUT\",\"GET\"] }", required = false)
    private String id;

    @NotNull
    @Column(name = "user_id", insertable = false, updatable = false)
    @ApiModelProperty(value = "{ \"description\" : \"User associated with the username.\", \"verbs\":[\"POST\",\"PUT\",\"GET\"] }", required = true)
    private String userID;

    @NotNull
    @Column(name = "organisation_id", insertable = false, updatable = false)
    @ApiModelProperty(value = "{ \"description\" : \"Organization associated of the user\", \"verbs\":[\"POST\",\"PUT\",\"GET\"] }", required = true)
    private String organizationID;

    @NotNull
    @Column(name = "username")
    @ApiModelProperty(value = "{ \"description\" : \"The username.\", \"verbs\":[\"POST\",\"PUT\",\"GET\"] }", required = true)
    private String username;

    @Column(name = "first_name")
    @ApiModelProperty(value = "{ \"description\" : \"The user's first name.\", \"verbs\":[\"POST\",\"PUT\",\"GET\"] }", required = false)
    private String firstName;

    @Column(name = "last_name")
    @ApiModelProperty(value = "{ \"description\" : \"The user's last name.\", \"verbs\":[\"POST\",\"PUT\",\"GET\"] }", required = false)
    private String lastName;

    @Column(name = "profile_picture")
    private String profilePicture;

    @NotNull
    @XmlTransient
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
    })
    @ApiModelProperty(value = "{ \"description\" : \"The user object associated with the username.\", \"verbs\":[\"POST\",\"PUT\",\"GET\"] }", required = true)
    private User user;

    public Username() {}

    public Username(String id, String userID, String username, Date created) {
        this.id = id;
        this.userID = userID;
        this.username = username;
        setCreated(created);
    }

    private void setCreated(Date created) { }

    public Username(String username) {
        this.username = username;
    }

    @ApiModelProperty(value = "{ \"description\" : \"ID of the username.\", \"verbs\":[\"POST\",\"PUT\",\"GET\"] }", required = false)
    public String getID() {
        return id;
    }

    public void setID(String id) {
        this.id = id;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUsername() {
        return username;
    }

    */
/**
     * This is here to make it clear that the username IS the user's email.
     *
     * @return username
     *//*

    public String getEmail() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getOrganizationID() {
        return organizationID;
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

    @Override
    public void setOrganizationID(String organizationID) {
        this.organizationID = organizationID;
    }

}
*/
