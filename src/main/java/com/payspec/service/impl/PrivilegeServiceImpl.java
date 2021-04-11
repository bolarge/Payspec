package com.payspec.service.impl;

import com.payspec.domain.model.authority.Privilege;
import com.payspec.repository.springdatajpa.PrivilegeRepository;
import com.payspec.service.PrivilegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service("privilegeService")
public class PrivilegeServiceImpl implements PrivilegeService {

    @Autowired
    private PrivilegeRepository privilegeRepository;

    @Override
    public Collection<Privilege> findAllPrivileges() throws DataAccessException {
        return privilegeRepository.findAll();
    }

    @Override
    public Privilege savePrivilege(Privilege privilege) throws DataAccessException {
        return privilegeRepository.save(privilege);
    }
}
