package com.payspec.service;

import com.payspec.domain.model.organization.Organization;
import org.springframework.dao.DataAccessException;

import java.util.Collection;

public interface OrganizationService {

/*	List<? extends IOrganization> getAll() throws QuaspecServiceException;
	List<? extends IOrganization> getByIInstitution(String username) throws QuaspecServiceException;
	IOrganization get(String name) throws QuaspecServiceException;
	IOrganization createOrganization(IOrganization iOrganization) throws QuaspecServiceException;*/
	Collection<Organization> findAllOrganizations() throws DataAccessException;;
	Organization saveOrganization(Organization organization) throws DataAccessException;;

}
