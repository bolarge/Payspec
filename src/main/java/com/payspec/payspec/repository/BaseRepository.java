package com.payspec.payspec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.Optional;

@NoRepositoryBean
public interface BaseRepository<T, ID> extends JpaRepository<T, ID> {

	//T findByUserName(String username);

	//T findByEmail(String email);

	Optional<T> findById(ID id);

}
