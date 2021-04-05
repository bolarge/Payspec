/*
package com.payspec.payspec.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/organizations")
public class Organization {

	@Autowired
	@Qualifier("organizationService")
	private OrganizationService iOrganizationService;

	@Secured({"ROLE_USER"})
	@RequestMapping(method = RequestMethod.GET)
	public List<OrganizationResource> getAll() throws QuaspecServiceException {
		List<OrganizationResource> result = new ArrayList<>();
		List<? extends IOrganization> organizations = iOrganizationService.getAll();
		for (IOrganization organization : organizations) {
			result.add(new OrganizationResource(organization));
		}
		return result;
	}

	@Secured({"ROLE_ADMIN", "ROLE_USER"})
	@RequestMapping(method = RequestMethod.POST)
	public OrganizationResource createOrganization(@RequestBody OrganizationResource iOrganization) {
		if(iOrganization != null) {
			IOrganization organization = iOrganizationService.createOrganization(iOrganization);
			if(organization != null) {
				return new OrganizationResource(organization);
			}
		}
		return null;
	}

}
*/
