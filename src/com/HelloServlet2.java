package com;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet2 extends GenericServlet {

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
//        PrintWriter writer = servletResponse.getWriter();
//        //解决编码问题统一为utf-8也可为其他编码格式
//        servletResponse.setContentType("text/plain;charset=utf-8");
//        writer.print("你好 servlet");
//        writer.flush();

        System.out.println("执行剩下的");
        HttpServletRequest httpServletRequest=(HttpServletRequest) servletRequest;
        //运用request session application传递数据
        System.out.println("httpServletRequest.getAttribute(\"name\") = " + httpServletRequest.getAttribute("name"));

        //session
        HttpSession session=httpServletRequest.getSession();
        System.out.println("session.getAttribute(\"name\") = " + session.getAttribute("name"));
        //application
        ServletContext servletContext = httpServletRequest.getServletContext();
        System.out.println("servletContext.getAttribute(\"name\") = " + servletContext.getAttribute("name"));
    }
}
