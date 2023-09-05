package web.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;


//获取请求头数据
@WebServlet("/request_4")
public class RequestDome4 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //请求头名称
        resp.getWriter().write("4被访问了");
        req.getRequestDispatcher("/request_5").forward(req,resp);
    }
}
