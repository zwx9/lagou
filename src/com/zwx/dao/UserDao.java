package com.zwx.dao;

import com.zwx.entity.User;

import java.sql.SQLException;

public interface UserDao {
    boolean registerUser(User user) throws SQLException, ClassNotFoundException;
    boolean loginUser(User user) throws SQLException, ClassNotFoundException;


}
