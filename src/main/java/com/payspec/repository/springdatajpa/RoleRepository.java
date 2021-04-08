package com.payspec.repository.springdatajpa;

import com.payspec.domain.model.authority.Role;
import com.payspec.repository.GenericBaseRepository;
import org.springframework.context.annotation.Profile;

@Profile("spring-data-jpa")
public interface RoleRepository extends GenericBaseRepository<Role, Long> {
}
