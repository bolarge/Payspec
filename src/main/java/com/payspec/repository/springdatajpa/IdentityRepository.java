package com.payspec.repository.springdatajpa;

import com.payspec.domain.model.user.UserIdentity;
import com.payspec.repository.GenericBaseRepository;

public interface IdentityRepository extends GenericBaseRepository<UserIdentity, Long> {
}
