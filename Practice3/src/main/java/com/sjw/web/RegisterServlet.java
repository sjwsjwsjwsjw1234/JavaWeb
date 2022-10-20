package com.sjw.web;

import com.sjw.service.UserService;
import com.sjw.utils.ChineseUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserService userService = new UserService();
        String username = ChineseUtils.transfer(request, "username");
        String password = ChineseUtils.transfer(request, "password");
        String checkCode = ChineseUtils.transfer(request, "checkCode");
        HttpSession session = request.getSession();
        String checkCode2 = (String) session.getAttribute("checkCode");
        System.out.println(checkCode2);
        System.out.println(checkCode);
        if (checkCode2.equals(checkCode)) {
            System.out.println("1");
            if (username == null) {
                request.setAttribute("register_msg1", "请输入账号");
            }else if (password==null){
                request.setAttribute("register_msg2", "请输入密码");
            }else{
                System.out.println("2");
                if (userService.SelectByUsername(username)!=null){
                    request.setAttribute("register_msg3", "账号名已被使用");
                }else{
                    System.out.println("3");
                    userService.insert(username,password);
                    request.setAttribute("register_msg4", "注册成功，请登录");
                    request.getRequestDispatcher("/login.jsp").forward(request,response);
                    return;
                }
            }
            request.getRequestDispatcher("/register.jsp").forward(request,response);
            return;
        }else{
            request.setAttribute("register_msg5", "验证码错误");
            request.getRequestDispatcher("/register.jsp").forward(request,response);
            return;
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
