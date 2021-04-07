package com.payspec.repository.springdatajpa;

import com.payspec.domain.model.organization.Organization;
import com.payspec.repository.GenericBaseRepository;
import org.springframework.context.annotation.Profile;

@Profile("spring-data-jpa")
public interface OrganizationRepository extends GenericBaseRepository<Organization, Long> {

}
