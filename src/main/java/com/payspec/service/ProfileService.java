package com.payspec.service;

import com.payspec.domain.api.IProfile;
import com.payspec.domain.api.IUser;
import com.payspec.domain.exception.QuaspecServiceException;

import java.util.List;

public interface ProfileService {

	List<? extends IProfile> getByIUser(IUser iUser) throws QuaspecServiceException;
}
