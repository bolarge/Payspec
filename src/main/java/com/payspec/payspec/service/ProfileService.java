package com.payspec.payspec.service;

import com.payspec.payspec.domain.api.IProfile;
import com.payspec.payspec.domain.exception.QuaspecServiceException;
import com.payspec.payspec.domain.api.IUser;

import java.util.List;

public interface ProfileService {

	List<? extends IProfile> getByIUser(IUser iUser) throws QuaspecServiceException;
}
