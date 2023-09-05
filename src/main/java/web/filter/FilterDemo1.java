package web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter("/*")//访问所有资源前都执行
public class FilterDemo1 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("doing");

        //考虑是否发行
        filterChain.doFilter(servletRequest,servletResponse);//放行

    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
