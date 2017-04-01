package org.together.and.service.impl;

import org.springframework.stereotype.Service;
import org.together.and.mapper.UserMapper;
import org.together.and.model.User;
import org.together.and.model.UserExample;
import org.together.and.service.UserService;

@Service("systemUserService")
public class UserServiceImpl extends BaseServiceImpl<User, UserExample, UserMapper> implements UserService {

}
