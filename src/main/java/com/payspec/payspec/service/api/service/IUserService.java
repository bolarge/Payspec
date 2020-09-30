package com.payspec.payspec.service.service;

import com.quatspec.api.exception.QuaspecServiceException;
import com.quatspec.api.model.IUser;

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
