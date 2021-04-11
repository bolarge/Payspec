package com.payspec.service;

import com.payspec.domain.model.authority.Privilege;
import org.springframework.dao.DataAccessException;

import java.util.Collection;

public interface PrivilegeService {
    Collection<Privilege> findAllPrivileges() throws DataAccessException;
    Privilege savePrivilege(Privilege privilege) throws DataAccessException;
}
