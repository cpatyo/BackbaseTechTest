package com.backbase.techtest.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.web.context.support.WebApplicationContextUtils;

public abstract class ServletBase extends HttpServlet {

    protected AutowireCapableBeanFactory ctx;

    @Override
    public void init() throws ServletException {
        super.init();
         ctx = WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext()).getAutowireCapableBeanFactory();
         ctx.autowireBean(this);
    }
}