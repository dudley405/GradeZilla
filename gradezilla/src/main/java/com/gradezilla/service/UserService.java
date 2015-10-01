package com.gradezilla.service;

import com.gradezilla.dao.entity.User;

/**
 * Created by lenovo on 9/24/2015.
 */
public interface UserService {

    User findUserByUserName(String userName);
}
