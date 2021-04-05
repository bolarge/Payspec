package com.payspec.payspec.service;

import com.payspec.payspec.domain.api.IOrganization;
import com.payspec.payspec.domain.exception.QuaspecServiceException;

import java.util.List;

public interface OrganizationService {

	List<? extends IOrganization> getAll() throws QuaspecServiceException;

	List<? extends IOrganization> getByIInstitution(String username) throws QuaspecServiceException;

	IOrganization get(String name) throws QuaspecServiceException;

	IOrganization createOrganization(IOrganization iOrganization) throws QuaspecServiceException;
}
