package com.payspec.service.impl;

import com.payspec.domain.model.organization.Identity;
import com.payspec.domain.model.user.UserIdentity;
import com.payspec.repository.springdatajpa.IdentityRepository;
import com.payspec.service.IdentityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service("identityService")
public class IdentityServiceImpl implements IdentityService {

    @Autowired
    private IdentityRepository identityRepository;

    @Override
    public Collection<UserIdentity> findAllUserIdentities() throws DataAccessException {
        return identityRepository.findAll();
    }

    @Override
    public UserIdentity save(UserIdentity userIdentity) throws DataAccessException {
        return identityRepository.save(userIdentity);
    }
}
