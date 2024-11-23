package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

public class loginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        if("admin".equals(username) && "123".equals(password))
        {
            //登录成功
            //用session保存状态
            HttpSession session = req.getSession();
            session.setAttribute("user",username);
            req.getRequestDispatcher("/WEB-INF/page/index.jsp").forward(req,resp);
        }else{
            req.getRequestDispatcher("/WEB-INF/page/error.jsp").forward(req,resp);
        }
    }
}
