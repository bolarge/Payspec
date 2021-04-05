package com.payspec.payspec.service;

import com.payspec.payspec.domain.api.IUser;
import com.payspec.payspec.domain.exception.QuaspecServiceException;

import java.util.List;

public interface UserService {

	IUser getByUserId(Long userId) throws QuaspecServiceException;
	List<? extends IUser> getAll() throws QuaspecServiceException;
	IUser getByUsername(String username) throws QuaspecServiceException;
	IUser createUser(IUser iUser) throws QuaspecServiceException;
	IUser updateUser(IUser iUser) throws QuaspecServiceException;
	void deleteUser(String userId) throws QuaspecServiceException;
	boolean isUserExist(String userId);

}
