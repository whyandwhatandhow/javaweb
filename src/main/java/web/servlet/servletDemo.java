package web.servlet;

import javax.servlet.*;
import java.io.IOException;

public class servletDemo implements Servlet {

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        //初始化方法，在创建的时候，只会执行一次
    }

    @Override
    public ServletConfig getServletConfig() {
        //获取配置对象
        return null;
    }


    //提供服务的方法
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.printf("hello servlet");
    }

    @Override
    public String getServletInfo() {
        //获取版本信息
        return null;
    }


    //销毁方法
    @Override
    public void destroy() {

    }
}
