package com;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class login_filter extends HttpFilter {
    @Override
    protected void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException, ServletException {

        //创建白名单
        List<String> witheNames = Arrays.asList(request.getContextPath() + "/login", request.getContextPath() + "/login.jsp");
        // 如果在白名单我就放行
        if (witheNames.contains(request.getRequestURI())) {
            chain.doFilter(request, response);
        } else {
            HttpSession session = request.getSession(false);
            // 有用户信息说明已经登录
            if (session != null && session.getAttribute("user") != null) {
                chain.doFilter(request, response);
            } else {
                response.sendRedirect(request.getContextPath() + "/login.jsp");
            }
        }
    }
}
