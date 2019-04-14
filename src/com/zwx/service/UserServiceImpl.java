package com.zwx.service;

import com.zwx.dao.JianliDao;
import com.zwx.dao.UserDao;
import com.zwx.dao.impl.JianliDaoImpl;
import com.zwx.dao.impl.UserDaoImpl;
import com.zwx.entity.*;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

@Service
public class UserServiceImpl implements UserService {
    UserDao userDao = new UserDaoImpl();
    JianliDao jianliDao = new JianliDaoImpl();

    @Override
    public boolean registerUser(User user) throws SQLException, ClassNotFoundException {
        return userDao.registerUser(user);
    }

    @Override
    public boolean loginUser(User user) throws SQLException, ClassNotFoundException {
        return userDao.loginUser(user);
    }

    @Override
    public boolean writeBasic(User_jianli user_jianli) {

        return jianliDao.writeBasic(user_jianli);
    }

    @Override
    public boolean rename_jl(User_jlname user_jlname) {

        return jianliDao.rename_jl(user_jlname);
    }

    @Override
    public boolean write_expect(User_jl_expect user_jl_expect) {

        return jianliDao.write_expect(user_jl_expect);
    }

    @Override
    public boolean write_workExp(User_jl_workExp user_jl_workExp) {
        return jianliDao.write_workExp(user_jl_workExp);
    }

    @Override
    public boolean write_proExp(User_jl_proExp user_jl_proExp) {
        return jianliDao.write_proExp(user_jl_proExp);
    }

    @Override
    public boolean write_eduShow(User_jl_eduShow user_jl_eduShow) {
        return jianliDao.write_eduShow(user_jl_eduShow);
    }

    @Override
    public boolean write_desc(User_jl_desc user_jl_desc) {
        return jianliDao.write_desc(user_jl_desc);
    }
}
