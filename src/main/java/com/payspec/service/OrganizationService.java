package com.payspec.service;

import com.payspec.domain.model.organization.Organization;
import org.springframework.dao.DataAccessException;

import java.util.Collection;

public interface OrganizationService {

	Collection<Organization> findAllOrganizations() throws DataAccessException;;
	Organization saveOrganization(Organization organization) throws DataAccessException;;

}
