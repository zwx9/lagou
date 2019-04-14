package com.zwx.dao;

import com.zwx.entity.*;

public interface JianliDao {
    boolean writeBasic(User_jianli user_jianli);    //填写简历中的基本资料
    boolean rename_jl(User_jlname user_jlname); //更改简历名称
    boolean write_expect(User_jl_expect user_jl_expect);    //填写期望工作
    boolean write_workExp(User_jl_workExp user_jl_workExp); //填写工作经历
    boolean write_proExp(User_jl_proExp user_jl_proExp);  //填写项目经验
    boolean write_eduShow(User_jl_eduShow user_jl_eduShow); //填写教育背景
    boolean write_desc(User_jl_desc user_jl_desc);//自我描述

}
