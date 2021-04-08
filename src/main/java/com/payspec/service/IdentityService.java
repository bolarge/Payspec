package com.payspec.service;

import com.payspec.domain.model.user.UserIdentity;
import org.springframework.dao.DataAccessException;

import java.util.Collection;

public interface IdentityService {

    Collection<UserIdentity> findAllUserIdentities() throws DataAccessException;
    UserIdentity save(UserIdentity userIdentity) throws DataAccessException;
}
