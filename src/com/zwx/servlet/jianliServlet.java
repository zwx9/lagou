package com.zwx.servlet;

import com.zwx.dao.JianliDao;
import com.zwx.dao.impl.JianliDaoImpl;
import com.zwx.entity.*;
import com.zwx.service.UserService;
import com.zwx.service.UserServiceImpl;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

@Controller
@RequestMapping(value = "/jianliServlet", method = RequestMethod.POST)
public class jianliServlet extends HttpServlet {
    //填写基本资料
    @RequestMapping(value = "/jianli_basic")
    public void jianli_basic(User_jianli user_jianli, HttpServletResponse response, HttpServletRequest request) {
        response.setCharacterEncoding("utf-8");
        UserService userService = new UserServiceImpl();
        HashMap<Object, Object> map = new HashMap<>();
        PrintWriter out = null;
        try {
            out = response.getWriter();
            boolean result = userService.writeBasic(user_jianli);
            if (result) {
                map.put("content",user_jianli);
                map.put("success",true);
                System.out.println("修改完成");
                JSONObject jsonObject = JSONObject.fromObject(map);
                out.print(jsonObject);
            } else {
                map.put("success",false);
                map.put("msg","保存失败！");
                JSONObject jsonObject = JSONObject.fromObject(map);
                out.print(jsonObject);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        out.flush();
        out.close();
    }

    //更改简历名称
    @RequestMapping(value = "/jianli_rename")
    public void jianli_rename(User_jlname user_jlname, HttpServletResponse response,HttpServletRequest request){
        response.setCharacterEncoding("utf-8");
        UserService userService = new UserServiceImpl();
        HashMap<Object, Object> map = new HashMap<>();
        PrintWriter out = null;
        try {
            out = response.getWriter();
            boolean result = userService.rename_jl(user_jlname);
            HttpSession session = request.getSession();
            System.out.println(user_jlname);
            if (result){
                session.setAttribute("user_jlemail",user_jlname.getEmail());
                map.put("content",user_jlname);
                map.put("success",true);
                JSONObject jsonObject = JSONObject.fromObject(map);
                out.print(jsonObject);
            }else {
                map.put("success",false);
                map.put("msg","保存失败！");
                JSONObject jsonObject = JSONObject.fromObject(map);
                out.print(jsonObject);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        out.flush();
        out.close();
    }

    //填写期望工作
    @RequestMapping(value = "/jianli_expect")
    public void jianli_expect(User_jl_expect user_jl_expect, HttpServletResponse response,HttpServletRequest request){
        response.setCharacterEncoding("utf-8");
        UserService userService = new UserServiceImpl();
        HashMap<Object, Object> map = new HashMap<>();
        PrintWriter out = null;
        try {
            System.out.println("user_jl_expect :"+user_jl_expect);
            out = response.getWriter();
            boolean expect = userService.write_expect(user_jl_expect);
            HttpSession session = request.getSession();
            if (expect){
                session.setAttribute("jl_expect",user_jl_expect.getCity());
                map.put("content",user_jl_expect);
                map.put("success",true);
                JSONObject jsonObject = JSONObject.fromObject(map);
                out.print(jsonObject);
            }else {
                map.put("success",false);
                map.put("msg","保存失败！");
                JSONObject jsonObject = JSONObject.fromObject(map);
                out.print(jsonObject);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        out.flush();
        out.close();
    }

    //填写工作经历
    @RequestMapping(value = "/jianli_workExp")
    public void jianli_workExp(User_jl_workExp user_jl_workExp,HttpServletResponse response,HttpServletRequest request){
        response.setCharacterEncoding("utf-8");
        UserService userService = new UserServiceImpl();
        HashMap<Object, Object> map = new HashMap<>();
        PrintWriter out = null;
        try {
            System.out.println(user_jl_workExp);
            out = response.getWriter();
            boolean workExp = userService.write_workExp(user_jl_workExp);
            HttpSession session = request.getSession();
            if (workExp){
                map.put("content",user_jl_workExp);
                map.put("success",true);
                JSONObject jsonObject = JSONObject.fromObject(map);
                out.print(jsonObject);
            }else {
                map.put("success",false);
                map.put("msg","保存失败！");
                JSONObject jsonObject = JSONObject.fromObject(map);
                out.print(jsonObject);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        out.flush();
        out.close();

    }

    //填写项目经验
    @RequestMapping(value = "/jianli_proExp")
    public void jianli_proExp(User_jl_proExp user_jl_proExp,HttpServletResponse response,HttpServletRequest request){
        response.setCharacterEncoding("utf-8");
        UserService userService = new UserServiceImpl();
        HashMap<Object, Object> map = new HashMap<>();
        PrintWriter out = null;
        try {
            System.out.println(user_jl_proExp);
            out = response.getWriter();
            boolean proExp = userService.write_proExp(user_jl_proExp);
            if (proExp){
                map.put("content",user_jl_proExp);
                map.put("success",true);
                map.put("code",3);
                JSONObject jsonObject = JSONObject.fromObject(map);
                out.print(jsonObject);
            }else {
                map.put("success",false);
                map.put("msg","保存失败！");
                JSONObject jsonObject = JSONObject.fromObject(map);
                out.print(jsonObject);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        out.flush();
        out.close();
    }

        //填写教育背景
        @RequestMapping(value = "/jianli_eduShow")
        public void jianli_eduShow(User_jl_eduShow user_jl_eduShow,HttpServletResponse response,HttpServletRequest request){
            response.setCharacterEncoding("utf-8");
            UserServiceImpl userService = new UserServiceImpl();
            HashMap<Object, Object> map = new HashMap<>();
            PrintWriter out = null;
            try {
                out = response.getWriter();
                boolean eduShow = userService.write_eduShow(user_jl_eduShow);
                if (eduShow){
                    map.put("content",user_jl_eduShow);
                    map.put("success",true);
                    JSONObject jsonObject = JSONObject.fromObject(map);
                    out.print(jsonObject);
                }else{
                    map.put("success",false);
                    JSONObject jsonObject = JSONObject.fromObject(map);
                    out.print(jsonObject);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            out.flush();
            out.close();
        }

        //自我描述
        @RequestMapping(value = "/jianli_desc")
        public void jianli_desc(User_jl_desc user_jl_desc,HttpServletResponse response,HttpServletRequest request){
            response.setCharacterEncoding("utf-8");
            UserService userService = new UserServiceImpl();
            HashMap<Object, Object> map = new HashMap<>();
            HttpSession session = request.getSession();
            PrintWriter out = null;
            try {
                out = response.getWriter();
                boolean writeDesc = userService.write_desc(user_jl_desc);
                if (writeDesc){
                    map.put("content",user_jl_desc);
                    map.put("success",true);
                    JSONObject jsonObject = JSONObject.fromObject(map);
                    out.print(jsonObject);
                }else{
                    map.put("success",false);
                    JSONObject jsonObject = JSONObject.fromObject(map);
                    out.print(jsonObject);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            out.flush();
            out.close();

        }

}