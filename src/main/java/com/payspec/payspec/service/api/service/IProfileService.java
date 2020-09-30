package com.payspec.payspec.service.service;

import com.quatspec.api.exception.QuaspecServiceException;
import com.quatspec.api.model.IProfile;
import com.quatspec.api.model.IUser;

import java.util.List;

public interface IProfileService {

	List<? extends IProfile> getByIUser(IUser iUser) throws QuaspecServiceException;
}
