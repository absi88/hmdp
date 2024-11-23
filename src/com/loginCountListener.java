package com;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletRequestEvent;
import jakarta.servlet.ServletRequestListener;

public class loginCountListener implements ServletRequestListener {
    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        ServletContext application = sre.getServletContext();
        Object visitcount = application.getAttribute("visitcount");
        if(visitcount == null)
        {
            application.setAttribute("visitcount",1);
        }else{
            if(visitcount instanceof Integer)
            {
                Integer count=(Integer) visitcount;
                application.setAttribute("visitcount",count+1);
            }else{
                throw new RuntimeException("数据有误");
            }
        }
    }
}
