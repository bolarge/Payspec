package com.payspec.payspec.service.service;

import com.quatspec.api.exception.QuaspecServiceException;
import com.quatspec.api.model.IOrganization;

import java.util.List;

public interface IOrganizationService {
	
	List<? extends IOrganization> getAll() throws QuaspecServiceException;
	
	List<? extends IOrganization> getByIInstitution(String username) throws QuaspecServiceException;
	
	IOrganization get(String name) throws QuaspecServiceException;
	
	IOrganization createOrganization(IOrganization iOrganization) throws QuaspecServiceException;
}
