package com.payspec.service;

import com.payspec.domain.model.authority.Role;
import org.springframework.dao.DataAccessException;

import java.util.Collection;

public interface RoleService {

    Collection<Role> findAllRoles() throws DataAccessException;
    Role saveRole(Role role) throws DataAccessException;
}
