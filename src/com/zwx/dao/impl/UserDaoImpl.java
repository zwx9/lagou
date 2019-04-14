package com.zwx.dao.impl;

import com.zwx.dao.UserDao;
import com.zwx.entity.User;
import com.zwx.util.DataSourceUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayListHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    //注册账户
    @Override
    public boolean registerUser(User user) {
        boolean flag = false;
        String sql = "insert into user(email,password) values(?,?)";
        Object[] params = {user.getEmail(),user.getPassword()};
        QueryRunner queryRunner = new QueryRunner(DataSourceUtil.getDataSourceWithC3P0ByConfig());
        System.out.println("22222222222222");
        int update = 0;
        try {
            update = queryRunner.update(sql,params);
            if(update>0){
                flag = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return flag;
    }


    //账户登录
    @Override
    public boolean loginUser(User user)  {
        boolean flag = false;
        String sql = "select * from user where email = ? and password = ?";
        Object[] params = {user.getEmail(),user.getPassword()};
        QueryRunner queryRunner = new QueryRunner(DataSourceUtil.getDataSourceWithC3P0ByConfig());
        System.out.println("11111111111");
        try {
            List<Object[]> query = queryRunner.query(sql, new ArrayListHandler(), params);
            System.out.println(query.size());
            if(query.size()>0){
                flag = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flag;
    }



}
