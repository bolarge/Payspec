package com.payspec.repository;

import org.springframework.context.annotation.Profile;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Profile("spring-data-jpa")
public class UserRepositoryImpl {

    @PersistenceContext
    private EntityManager entityManager;

    //void delete(User user) throws DataAccessException;

}
