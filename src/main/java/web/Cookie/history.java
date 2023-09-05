package web.Cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/cookie_3")
public class history extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html;charset=utf-8");

        Cookie[] cookies = req.getCookies();
        boolean flag=false;
        if(cookies!=null&&cookies.length>0){
            for (Cookie cookie : cookies) {
                String name = cookie.getName();
                if("lastTime".equals(name)){//不是第一次访问
                    flag=true;
                    //设置时间
                    Date date=new Date();
                    SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日  HH:mm:ss");
                    String date_value = sdf.format(date);
                    cookie.setValue(date_value);
                    resp.addCookie(cookie);//覆盖原来的cookie
                    cookie.setMaxAge(3000);//持久化存储

                    //响应数据（欢迎回来）
                    String value = cookie.getValue();
                    resp.getWriter().write("欢迎回来"+value);

                    break;
                }
            }
        }

        if(cookies==null||cookies.length==0||flag==false){
            Date date=new Date();
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日  HH:mm:ss");
            String date_value = sdf.format(date);
            resp.getWriter().write("欢迎回来首次访问");
        }

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }
}
