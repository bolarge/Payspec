package com.payspec.domain.api;

public interface IUserIdentity extends IIdentity {

    String getLastName();

    void setLastName(String lastName);

    String getFirstName();

    void setFirstName(String firstName);
}
