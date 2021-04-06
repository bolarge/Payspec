package com.payspec.payspec.repository;

import com.payspec.payspec.domain.AbstractUser;
import org.springframework.dao.DataAccessException;

import java.util.Collection;

public interface UserRepositoryBack {

    AbstractUser save(AbstractUser user) throws DataAccessException;

    AbstractUser findById(Long id) throws DataAccessException;

    Collection<AbstractUser> findAll() throws DataAccessException;


    //void delete(User user) throws DataAccessException;

}
