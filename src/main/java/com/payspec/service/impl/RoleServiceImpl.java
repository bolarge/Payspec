package com.payspec.service.impl;

import com.payspec.domain.model.authority.Privilege;
import com.payspec.domain.model.authority.Role;
import com.payspec.repository.springdatajpa.RoleRepository;
import com.payspec.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.Optional;

@Service("roleService")
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    @Transactional(readOnly = true)
    public Collection<Role> findAllRoles() throws DataAccessException {
        return roleRepository.findAll();
    }

    @Override
    @Transactional
    public Role saveRole(Role role) throws Exception {
        if(role.getPrivileges() == null || role.getPrivileges().isEmpty()){
            throw new Exception("A role must have a privilege or default");
        }
       /* for (Privilege privilege : role.getPrivileges()) {
            if(privilege.getRoles() == null) {
                privilege.setRoles(role);
            }
        }*/
        return roleRepository.save(role);
    }

    @Override
    @Transactional(readOnly = true)
    public Role findRoleById(Long id) throws DataAccessException {
        Optional<Role> role = roleRepository.findById(id);
        if(role.isPresent()){
            return role.get();
        }
        return null;
    }

    @Override
    @Transactional
    public void deleteRole(Long id) throws DataAccessException {

    }

}
