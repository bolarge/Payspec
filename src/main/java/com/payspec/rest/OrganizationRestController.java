package com.payspec.rest;

import com.payspec.domain.model.identity.OrganizationIdentity;
import com.payspec.domain.model.identity.UserIdentity;
import com.payspec.domain.model.organization.Organization;
import com.payspec.service.IdentityService;
import com.payspec.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.Collection;

@RestController
@RequestMapping("/api/organizations")
public class OrganizationRestController {

    @Autowired
    private OrganizationService organizationService;

    @Autowired
	private IdentityService identityService;

    @RequestMapping(name = "", method = RequestMethod.GET)
    public ResponseEntity<Collection<Organization>> getAllOrganizations() {
		Collection<Organization> organizationCollection = organizationService.findAllOrganizations();
		if (organizationCollection.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(organizationCollection, HttpStatus.OK);
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public ResponseEntity<Void> createOrganization(@RequestBody Organization organization) {
		UserIdentity userIdentity = identityService.save(organization.getUserIdentity());
		organization = organizationService.saveOrganization(organization);
		HttpHeaders responseHeaders = new HttpHeaders();
		URI newUserUri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(organization.getId()).toUri();
		responseHeaders.setLocation(newUserUri);

		return new ResponseEntity<>(null, responseHeaders, HttpStatus.CREATED);
    }

	/*@Secured({"ROLE_USER"})
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
	}*/

}
