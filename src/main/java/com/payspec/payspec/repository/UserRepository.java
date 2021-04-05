package com.payspec.payspec.repository;

import com.payspec.payspec.domain.api.IUser;
import com.payspec.payspec.domain.model.User;

public interface UserRepository extends UserBaseRepository<User> {

    IUser save(IUser iUser);

}
