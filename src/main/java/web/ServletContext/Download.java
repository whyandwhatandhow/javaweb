package web.ServletContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


/*
* 点击超链接弹出下载提示框
* 完成图片下载
* */
@WebServlet("/download")
public class Download extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String filename = req.getParameter("filename");

        //字节流加载京内存

        //找到真实路径
        ServletContext servletContext=this.getServletContext();
        String realPath = servletContext.getRealPath("/img/" + filename);
        //用字节关联
        FileInputStream fis=new FileInputStream(realPath);


        //设置响应头
        //content-type
        String mimeType = servletContext.getMimeType(filename);
        resp.setHeader("content-type",mimeType);

        //content-disposition
        resp.setHeader("content-disposition","attachment;filename="+filename);//attachment以附件形式
        //将输入流写出
        ServletOutputStream fos=resp.getOutputStream();
        byte[] bytes=new byte[1024];
        int len=0;
        while((len=fis.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }

        fis.close();

    }
}
