package com.sjw.web;

import com.sjw.pojo.User;
import com.sjw.service.BrandService;
import com.sjw.service.UserService;
import com.sjw.utils.ChineseUtils;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private UserService userService=new UserService();
    private BrandService brandService=new BrandService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = ChineseUtils.transfer(request, "username");
        String password = ChineseUtils.transfer(request, "password");
        String remember= ChineseUtils.transfer(request, "remember");
        HttpSession session = request.getSession();
        User user = userService.selectByUsernameAndPassword(username, password);
        if (user!=null){
            session.setAttribute("user",user);
            if (remember!=null&&remember.equals("1")){
                Cookie cookie1 = new Cookie("username",username);
                Cookie cookie2 = new Cookie("password", password);
                cookie1.setMaxAge(60*60*24*7);
                cookie2.setMaxAge(60*60*24*7);
                response.addCookie(cookie1);
                response.addCookie(cookie2);

            }
            request.getRequestDispatcher("/demo").forward(request,response);

        }else{
            request.setAttribute("login_msg","账号或密码错误");
            request.getRequestDispatcher("/login.jsp").forward(request,response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
