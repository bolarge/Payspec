package com.payspec.payspec.service.impl;

import com.payspec.payspec.domain.AbstractUser;
import com.payspec.payspec.domain.model.User;
import com.payspec.payspec.repository.springdatajpa.UserRepository;
import com.payspec.payspec.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.Optional;

@Service("userService")
public class UserServiceImpl implements UserService {

	public final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

	@Autowired
	public UserRepository userRepository;

	@Override
	@Transactional(readOnly = true)
	public User findUserById(Long id) throws DataAccessException {
		Optional<User> user =  userRepository.findById(id);
		if(user.isPresent()){
			return user.get();
		}
		return null;
	}

	@Override
	public Collection<User> findAllUser() throws DataAccessException {
		return userRepository.findAll();
	}

	@Override
	@Transactional
	public User saveUser(User user) throws DataAccessException {
		return userRepository.save(user);
	}

}
