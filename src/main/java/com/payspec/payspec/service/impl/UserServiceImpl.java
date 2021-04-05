package com.payspec.payspec.service.impl;

import com.payspec.payspec.domain.model.User;
import com.payspec.payspec.domain.exception.QuaspecServiceException;
import com.payspec.payspec.domain.api.IUser;
import com.payspec.payspec.repository.UserRepository;
import com.payspec.payspec.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service("userService")
public class UserServiceImpl implements UserService {

	public final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

	@Autowired
	public UserRepository userRepository;

	@Override
	@Transactional
	public IUser getByUserId(Long userId) throws QuaspecServiceException {
		Optional<User> user =  userRepository.findById(userId);
		if(user.isPresent()){
			 return user.get();
		}
		return null;
	}

	@Override
	@Transactional
	public List<? extends IUser> getAll() throws QuaspecServiceException {
		return userRepository.findAll();
	}

	@Override
	@Transactional
	public IUser getByUsername(String username) throws QuaspecServiceException {
		return userRepository.findByUserName(username);
	}

	@Override
	public IUser createUser(IUser iUser) throws QuaspecServiceException {
		IUser user = null;
		//com.payspec.payspec.domain.base.User organization = userRepository.findByEmail(iUser.getEmail());
		if(iUser.getUserType() != null) {
			user = new User();
			user.setUserName(iUser.getUserName());
			user.setEmail(iUser.getEmail());
			//user.setPassword(passwordEncoder.encode(iUser.getPassword()));
			user.setGsmPhoneNumber(iUser.getGsmPhoneNumber());
			user.setNationalId(iUser.getNationalId());
			//customer.setOrganization();
			user.setUserType(iUser.getUserType());
			if(iUser instanceof User){
				user = userRepository.save(user);
			}
		}
		return user;
	}

	@Override
	public IUser updateUser(IUser iUser) throws QuaspecServiceException {
		return createUser(iUser);
	}

	@Override
	public void deleteUser(String userId) throws QuaspecServiceException {
		userRepository.deleteById(userRepository.findByUserName(userId).getId());
	}

	@Override
	public boolean isUserExist(String userId) {
		return userRepository.existsById(userRepository.findByUserName(userId).getId());
	}

}
