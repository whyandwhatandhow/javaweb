package web.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;


//获取请求头数据
@WebServlet("/request_2")
public class RequestDome2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //请求头名称
        Enumeration<String> headerNames = req.getHeaderNames();
        while(headerNames.hasMoreElements()) {
            String name = headerNames.nextElement();
            String header = req.getHeader(name);
            System.out.println(header);
            //localhost:8080
            //keep-alive
            //"Not/A)Brand";v="99", "Microsoft Edge";v="115", "Chromium";v="115"
            //?0
            //"Windows"
            //1
            //Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/115.0.0.0 Safari/537.36 Edg/115.0.1901.183
            //text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7
            //none
            //navigate
            //?1
            //document
            //gzip, deflate, br
            //zh-CN,zh;q=0.9,en;q=0.8,en-GB;q=0.7,en-US;q=0.6
            //JSESSIONID=2A6CF3E62B9D37289702D4BC865BFED4; Idea-7f1174f=5b136bf8-f02c-4275-8a63-db6923d0fdd4; Idea-ae708ead=c01c19fa-b7dd-4938-a349-5e98a26da4f1
        }


        //浏览器
        String agent=req.getHeader("user-agent");
        if(agent.contains("Chrome")){
            System.out.println("谷歌");
        }else if (agent.contains("Firefox")){
            System.out.println("火狐");
        }else {
            System.out.println("edge");
        }


        //referer数据从哪来
        String referer=req.getHeader("referer");
        System.out.println(referer);
        if(referer!=null){
            if(referer.contains("/web")){
                System.out.println("正常访问");
            }else {
                System.out.println("盗链");
            }
        }
    }
}
