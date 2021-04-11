package com.payspec.repository.springdatajpa;

import com.payspec.domain.model.authority.Privilege;
import com.payspec.repository.GenericBaseRepository;
import org.springframework.context.annotation.Profile;

@Profile("spring-data-jpa")
public interface PrivilegeRepository extends GenericBaseRepository<Privilege, Long> {
}
