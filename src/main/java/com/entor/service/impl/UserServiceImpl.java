package com.entor.service.impl;

import org.springframework.stereotype.Repository;

import com.entor.entity.User;
import com.entor.service.UserService;

@Repository("userService")
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService{

}
