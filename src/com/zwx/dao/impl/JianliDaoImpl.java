package com.zwx.dao.impl;

import com.zwx.dao.JianliDao;
import com.zwx.entity.*;
import com.zwx.util.DataSourceUtil;
import org.apache.commons.dbutils.QueryRunner;

import javax.management.Query;
import java.sql.SQLException;

public class JianliDaoImpl implements JianliDao {

    //填写基本信息
    @Override
    public boolean writeBasic(User_jianli user_jianli) {
        boolean flag = false;
        System.out.println(user_jianli);
        String sql = "update user_jianli set name = ?,gender = ?,topDegree = ?,workyear = ?,tel = ?,currentState = ? where email = ?";
        Object[] params = {user_jianli.getName(),user_jianli.getGender(),user_jianli.getTopDegree(),user_jianli.getWorkyear(),user_jianli.getTel(),user_jianli.getCurrentState(),user_jianli.getEmail()};
        QueryRunner insert = new QueryRunner(DataSourceUtil.getDataSourceWithC3P0ByConfig());
        try {
            int update = insert.update(sql, params);
            if(update>0){
                System.out.println(13);
                flag = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flag;
    }

    //修改简历名称
    @Override
    public boolean rename_jl(User_jlname user_jlname) {
        boolean flag = false;
        String sql = "update jianliname set jlname = ? where email = ?";
        Object[] params = {user_jlname.getJlname(),user_jlname.getEmail()};
        QueryRunner update_jlname = new QueryRunner(DataSourceUtil.getDataSourceWithC3P0ByConfig());
        try {
            int update = update_jlname.update(sql, params);
            if (update>0){
                flag = true;
            }else {
                flag = false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flag;
    }

    //填写期望工作
    @Override
    public boolean write_expect(User_jl_expect user_jl_expect) {
        boolean flag = false;
        String sql = "update user_jl_expect set city = ?,positionType = ?,positionName = ?,salarys = ? where email = ?";
        Object[] params = {user_jl_expect.getCity(),user_jl_expect.getPositionType(),user_jl_expect.getPositionName(),user_jl_expect.getSalarys(),user_jl_expect.getEmail()};
        QueryRunner update_expect = new QueryRunner(DataSourceUtil.getDataSourceWithC3P0ByConfig());
        try {
            int update = update_expect.update(sql, params);
            if (update>0){
                flag = true;
            }else {
                flag = false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flag;
    }


    //填写工作经历
    @Override
    public boolean write_workExp(User_jl_workExp user_jl_workExp) {
        boolean flag = false;
        String sql = "update user_workExp set companyName = ?,positionName = ?,startYear = ?,startMonth = ?,endYear = ?,endMonth = ?,expid = ? where email = ?";
        Object[] params = {user_jl_workExp.getCompanyName(),user_jl_workExp.getPositionName(),user_jl_workExp.getStartYear(),user_jl_workExp.getStartMonth(),user_jl_workExp.getEndYear(),user_jl_workExp.getEndMonth(),user_jl_workExp.getExpid(),user_jl_workExp.getEmail()};
        QueryRunner update_workExp = new QueryRunner(DataSourceUtil.getDataSourceWithC3P0ByConfig());
        try {
            int update = update_workExp.update(sql, params);
            if (update>0){
                flag = true;
            }else {
                flag = false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flag;
    }

    //填写项目经验
    @Override
    public boolean write_proExp(User_jl_proExp user_jl_proExp) {
        boolean flag = false;
        String sql = "insert into user_jl_proexp(projectName,positionName,startYear,startMonth,endYear,endMonth,projectRemark,projectid,email) values(?,?,?,?,?,?,?,?,?)";
        Object[] params = {user_jl_proExp.getProjectName(),user_jl_proExp.getPositionName(),user_jl_proExp.getStartYear(),user_jl_proExp.getStartMonth(),user_jl_proExp.getEndYear(),user_jl_proExp.getEndMonth(),user_jl_proExp.getProjectRemark(),user_jl_proExp.getProjectid(),user_jl_proExp.getEmail()};
        QueryRunner insert_proExp = new QueryRunner(DataSourceUtil.getDataSourceWithC3P0ByConfig());
        try {
            int insert = insert_proExp.update(sql, params);
            System.out.println("insert : "+insert);
            if (insert > 0){
                flag = true;
            }else{
                flag = false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flag;
    }

    //填写教育背景
    @Override
    public boolean write_eduShow(User_jl_eduShow user_jl_eduShow) {
        boolean flag = false;
        String sql = "update user_jl_edushow set schoolName = ?,education = ?,professional = ?,startYear = ?,endYear = ?,eduid = ? where email  = ?";
        Object[] params = {user_jl_eduShow.getSchoolName(),user_jl_eduShow.getEducation(),user_jl_eduShow.getProfessional(),user_jl_eduShow.getStartYear(),user_jl_eduShow.getEndYear(),user_jl_eduShow.getEduid(),user_jl_eduShow.getEmail()};
        QueryRunner update_eduShow = new QueryRunner(DataSourceUtil.getDataSourceWithC3P0ByConfig());
        try {
            int update = update_eduShow.update(sql, params);
            if(update > 0){
                flag = true;
            }else {
                flag = false;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean write_desc(User_jl_desc user_jl_desc) {
        boolean flag = false;
        String sql = "update user_jl_desc set myRemark = ? where email = ?";
        Object[] params = {user_jl_desc.getMyRemark(),user_jl_desc.getEmail()};
        QueryRunner update_desc = new QueryRunner(DataSourceUtil.getDataSourceWithC3P0ByConfig());
        try {
            int update = update_desc.update(sql, params);
            if (update>0){
                flag = true;
            }else{
                flag = false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flag;
    }


}
