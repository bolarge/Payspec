package com.payspec.payspec.repository;

import com.payspec.payspec.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.Optional;

@NoRepositoryBean
public interface UserBaseRepository<T extends User> extends JpaRepository<T, Long> {

	T findByUserName(String username);

	T findByEmail(String email);

	Optional<T> findById(Long userId);

}
