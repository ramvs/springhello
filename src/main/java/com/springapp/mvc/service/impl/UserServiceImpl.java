package com.springapp.mvc.service.impl;

import com.springapp.mvc.dao.UserDAO;
import com.springapp.mvc.model.User;
import com.springapp.mvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Krystian on 2015-11-01.
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    UserDAO userDAO;
    public List<User> list() {
        return userDAO.list();
    }

    @Override
    public void saveUser(User user) {
        this.userDAO.saveUser(user);
    }
}
