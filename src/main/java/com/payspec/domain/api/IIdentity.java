package com.payspec.domain.api;

public interface IIdentity {
    Long getId();

    void setId(Long id);

    String getEmail();

    void setEmail(String email);

    String getUserName();

    void setUserName(String userName);

    String getPassword();

    void setPassword(String password);
}
