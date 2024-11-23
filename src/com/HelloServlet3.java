package com;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet3 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();

        //解决编码问题统一为utf-8也可为其他编码格式
        resp.setContentType("text/plain;charset=utf-8");

        //重定向的实现
//        resp.setStatus(302);
//        resp.setHeader("Location","https://www.baidu.com");

        resp.sendRedirect("https://www.baidu.com");
        writer.print("你好 servlet");
        writer.flush();
    }
}
