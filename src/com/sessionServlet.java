package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.UUID;

public class sessionServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       //访问时创建session
        HttpSession session = req.getSession();
        //手动添加cookie,防止关闭浏览器后找不到session
        Cookie cookie = new Cookie("jsessionid", UUID.randomUUID().toString());
        cookie.setMaxAge(18000);
        cookie.setHttpOnly(true);
        resp.addCookie(cookie);
        session.setAttribute("name","Lucy");

    }
}
