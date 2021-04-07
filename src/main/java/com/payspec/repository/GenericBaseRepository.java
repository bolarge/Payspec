package com.payspec.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GenericBaseRepository<T, ID> extends JpaRepository<T, ID> {

}
