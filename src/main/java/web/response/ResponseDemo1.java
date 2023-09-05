package web.response;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/response_1")

//完成重定向
public class ResponseDemo1 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //访问response_1，自动跳转到demo2
        System.out.println("demo1");
        //设置状态码302
 //       resp.setStatus(302);
        //设置响应头
//        resp.setHeader("location","/HelloJavaweb_war_exploded/response_2");

        //或者
        resp.sendRedirect("/HelloJavaweb_war_exploded/response_2");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }
}
