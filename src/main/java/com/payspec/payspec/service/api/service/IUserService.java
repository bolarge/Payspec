package com.payspec.payspec.service.api.service;

import com.payspec.payspec.service.api.exception.QuaspecServiceException;
import com.payspec.payspec.service.api.model.IUser;

import java.util.List;

public interface IUserService {
	
	IUser getByUserId(Long userId) throws QuaspecServiceException;
	
	List<? extends IUser> getAll() throws QuaspecServiceException;
	
	IUser getByUsername(String username) throws QuaspecServiceException;
	
	IUser createUser(IUser iUser) throws QuaspecServiceException;
	
	IUser updateUser(IUser iUser) throws QuaspecServiceException;
	
	void deleteUser(String userId) throws QuaspecServiceException;
	
	boolean isUserExist(String userId);

}
