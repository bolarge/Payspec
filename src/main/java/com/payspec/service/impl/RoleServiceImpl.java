package com.payspec.service.impl;

import com.payspec.domain.model.authority.Role;
import com.payspec.repository.springdatajpa.RoleRepository;
import com.payspec.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service("roleService")
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public Collection<Role> findAllRoles() throws DataAccessException {
        return roleRepository.findAll();
    }

    @Override
    public Role saveRole(Role role) throws DataAccessException {
        return roleRepository.save(role);
    }
}
