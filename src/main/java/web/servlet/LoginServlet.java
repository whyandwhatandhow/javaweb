package web.servlet;

import java.lang.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String checkCode = req.getParameter("CheckCode");

        //获取验证码
        HttpSession session = req.getSession();
        String checkCodeSession = (String) session.getAttribute("checkCode_session");


        session.removeAttribute("checkCode_session");
        //判断验证码是否正确,不区分大小写
        if(checkCodeSession.equalsIgnoreCase(checkCode)){
            //判断用户名密码
            if("zhansan".equals(username)&&"123".equals(password)){
                //登录成功
                //储存用户信息
                session.setAttribute("user",username);
                //重定向success.jsp
                resp.sendRedirect(req.getContextPath()+"/success.jsp");
            }else {
                //登录失败
                req.setAttribute("login_error","用户名密码错误");

                req.getRequestDispatcher("/login.jsp").forward(req,resp);
            }
        }else {
            //存储提示信息
            req.setAttribute("cc_error","验证码错误");

            req.getRequestDispatcher("/login.jsp").forward(req,resp);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }
}
