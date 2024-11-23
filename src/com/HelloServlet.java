package com;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet implements Servlet {

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("初始化");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
//        PrintWriter writer = servletResponse.getWriter();
//        writer.print("aaa");
//        writer.flush();

        HttpServletRequest httpServletRequest=(HttpServletRequest) servletRequest;
        //请求与转发
        System.out.println("我执行了一部分");
        //执行转发
        //运用request session application传递数据
        httpServletRequest.setAttribute("name","request");

        //session
        HttpSession session=httpServletRequest.getSession();
        session.setAttribute("name","session");
        //application
        ServletContext servletContext = httpServletRequest.getServletContext();
        servletContext.setAttribute("name","application");
        servletRequest.getRequestDispatcher("/hello2").forward(servletRequest,servletResponse);
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("destroy()...执行一次");
    }
}
