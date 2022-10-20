package com.example.tomcat;

import javax.servlet.*;
import java.io.IOException;

public class Demo2 implements Servlet {
    @Override
    /**
     * 在servlet创建的时候执行，只执行一次
     */
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    /***
     * 提供服务方法，每一次Servlet被访问时执行
     */
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("server");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    /**
     * 在服务器关闭时执行
     */
    public void destroy() {
        System.out.println("destroy");
    }
}
