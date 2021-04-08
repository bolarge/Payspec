package com.payspec.repository.springdatajpa;

import com.payspec.domain.model.identity.UserIdentity;
import com.payspec.repository.GenericBaseRepository;
import org.springframework.context.annotation.Profile;

@Profile("spring-data-jpa")
public interface IdentityRepository extends GenericBaseRepository<UserIdentity, Long> {
}
