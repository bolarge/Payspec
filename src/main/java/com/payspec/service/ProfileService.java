package com.payspec.service;

import com.payspec.domain.model.authority.Profile;
import org.springframework.dao.DataAccessException;

import java.util.Collection;

public interface ProfileService {

	Collection<Profile> findAllProfiles()throws DataAccessException;
	Profile saveProfile(Profile profile) throws DataAccessException;
}
