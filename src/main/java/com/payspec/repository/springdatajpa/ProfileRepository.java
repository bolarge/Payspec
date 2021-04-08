package com.payspec.repository.springdatajpa;

import com.payspec.domain.model.authority.Profile;
import com.payspec.repository.GenericBaseRepository;

@org.springframework.context.annotation.Profile("spring-data-jpa")
public interface ProfileRepository extends GenericBaseRepository<Profile, Long> {

}
