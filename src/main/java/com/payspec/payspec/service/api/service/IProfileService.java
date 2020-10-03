package com.payspec.payspec.service.api.service;

import com.payspec.payspec.service.api.exception.QuaspecServiceException;
import com.payspec.payspec.service.api.model.IProfile;
import com.payspec.payspec.service.api.model.IUser;

import java.util.List;

public interface IProfileService {

	List<? extends IProfile> getByIUser(IUser iUser) throws QuaspecServiceException;
}
