package com.payspec.service.impl;

import com.payspec.domain.model.authority.Profile;
import com.payspec.repository.springdatajpa.ProfileRepository;
import com.payspec.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service("profileService")
public class ProfileServiceImpl implements ProfileService {

    @Autowired
    private ProfileRepository profileRepository;

    @Override
    public Collection<Profile> findAllProfiles() throws DataAccessException {
        return profileRepository.findAll();
    }

    @Override
    public Profile saveProfile(Profile profile) throws DataAccessException {
        return profileRepository.save(profile);
    }
}
