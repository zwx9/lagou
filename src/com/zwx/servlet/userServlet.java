package com.zwx.servlet;

import com.zwx.entity.User;
import com.zwx.service.UserService;
import com.zwx.service.UserServiceImpl;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping(value = "/userServlet",method = RequestMethod.POST)
public class userServlet extends HttpServlet{
    //注册新用户
    @RequestMapping(value = "/register")
    public void register(User user,HttpServletResponse response) throws SQLException, ClassNotFoundException, IOException, ServletException {
        UserService userService = new UserServiceImpl();
        PrintWriter out = response.getWriter();
        System.out.println("准备注册中...");
        if(userService.registerUser(user)){
            out.write("true");
        }else {
            out.write("false");
        }
        out.flush();
        out.close();
    }

    //用户登录
    @RequestMapping(value = "/login")
    public void login(User user,HttpServletResponse response,HttpServletRequest request) throws SQLException, ClassNotFoundException, IOException {
        UserService userService = new UserServiceImpl();
        PrintWriter out = response.getWriter();
        boolean usr = userService.loginUser(user);
        HttpSession session = request.getSession();
        System.out.println("2");
        if(usr){
            session.setAttribute("user",user.getEmail());
            out.write("true");
        }else {
            out.write("false");
        }
        out.flush();
        out.close();
    }

    //用户注销
    @RequestMapping(value = "/cancel")
    public void cancel(HttpServletResponse response,HttpServletRequest request) throws IOException {
        HttpSession session = request.getSession();
        session.invalidate();
        PrintWriter out = response.getWriter();
        out.flush();
        out.close();
    }

    //用户忘记密码
    @RequestMapping(value = "/foget")
    public void forget(User user,HttpServletResponse response,HttpServletRequest request){
        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        MimeMessage message = mailSender.createMimeMessage();
        try {
            MimeMessageHelper helper = new MimeMessageHelper(message,true,"utf-8");
            helper.setTo(user.getEmail());
            //helper.setFrom();



        } catch (MessagingException e) {
            e.printStackTrace();
        }


    }




}
