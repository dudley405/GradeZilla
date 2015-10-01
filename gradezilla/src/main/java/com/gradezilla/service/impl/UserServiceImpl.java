package com.gradezilla.service.impl;

import com.gradezilla.dao.entity.User;
import com.gradezilla.service.UserService;
import org.springframework.stereotype.Service;

/**
 * Created by lenovo on 9/24/2015.
 */
@Service
public class UserServiceImpl implements UserService {

    public User findUserByUserName(String userName) {
        return new User();
    }
}
