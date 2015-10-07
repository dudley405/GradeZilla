package com.gradezilla.dao;

import com.gradezilla.dao.entity.AppUser;

/**
 * Created by lenovo on 10/6/2015.
 */
public interface UserDao {
    AppUser findByUserName(String userName);
}
