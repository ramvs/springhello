package com.springapp.mvc.service;

import com.springapp.mvc.model.User;

import java.util.List;

/**
 * Created by Krystian on 2015-11-01.
 */
public interface UserService {
    public List<User> list();
    void saveUser(User user);
}
