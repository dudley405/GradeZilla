package com.gradezilla.dao.impl;

import com.gradezilla.dao.UserDao;
import com.gradezilla.dao.entity.AppUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

/**
 * Created by lenovo on 10/6/2015.
 */
@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    EntityManager entityManager;

    public AppUser findByUserName(String username) {
        return entityManager.
                createQuery("select u from AppUser u where userEmail = :userName", AppUser.class).
                setParameter("userName", username).getSingleResult();
    }
}
