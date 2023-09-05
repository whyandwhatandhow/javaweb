package web.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;


//获取请求体
@WebServlet("/request_3")
public class RequestDemo3 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取字符流
        BufferedReader reader = req.getReader();
        String line=null;
        while((line=reader.readLine())!=null){
            System.out.println(line);
        }


        //获取键值对
        String username=req.getParameter("username");
        System.out.println(username);
        String password =req.getParameter(("password"));
        System.out.println(password);


    }
}
