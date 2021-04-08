package com.payspec.repository;

import com.payspec.domain.model.user.AbstractUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.Optional;

@NoRepositoryBean
public interface BaseRepository<T extends AbstractUser> extends JpaRepository<T, Long> {

	//T findByUserName(String username);
	//T findByEmail(String email);

	Optional<T> findById(Long id);

}
