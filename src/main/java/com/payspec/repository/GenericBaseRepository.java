package com.payspec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface GenericBaseRepository<T, ID> extends JpaRepository<T, ID> {

}
