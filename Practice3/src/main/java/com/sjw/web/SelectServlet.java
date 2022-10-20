package com.sjw.web;

import com.sjw.pojo.User;
import com.sjw.service.UserService;
import com.sjw.utils.ChineseUtils;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/SelectServlet")
public class SelectServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = ChineseUtils.transfer(request, "username");
        User user = new UserService().SelectByUsername(username);
        response.getWriter().write(""+(user!=null));

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
