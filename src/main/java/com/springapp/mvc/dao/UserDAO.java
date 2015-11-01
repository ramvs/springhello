package com.springapp.mvc.dao;

import com.springapp.mvc.model.User;

import java.util.List;

/**
 * Created by Krystian on 2015-10-31.
 */
public interface UserDAO {
    public List<User> list();
    void saveUser(User user);

}
