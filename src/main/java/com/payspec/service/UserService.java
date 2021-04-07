package com.payspec.service;

import com.payspec.domain.model.user.User;
import org.springframework.dao.DataAccessException;

import java.util.Collection;

public interface UserService {

	User findUserById(Long id) throws DataAccessException;
	Collection<User> findAllUser() throws DataAccessException;
	//Page<User> findAll(Pageable pageable) throws DataAccessException;
	User saveUser(User user) throws DataAccessException;
	//void deleteUser(Long userId) throws DataAccessException;
}
