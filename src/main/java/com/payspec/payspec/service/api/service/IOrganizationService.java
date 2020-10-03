package com.payspec.payspec.service.api.service;

import com.payspec.payspec.service.api.exception.QuaspecServiceException;
import com.payspec.payspec.service.api.model.IOrganization;

import java.util.List;

public interface IOrganizationService {
	
	List<? extends IOrganization> getAll() throws QuaspecServiceException;
	
	List<? extends IOrganization> getByIInstitution(String username) throws QuaspecServiceException;
	
	IOrganization get(String name) throws QuaspecServiceException;
	
	IOrganization createOrganization(IOrganization iOrganization) throws QuaspecServiceException;
}
