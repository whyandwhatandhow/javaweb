package web.response;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

@WebServlet("/checkCode")
public class CheckCode extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int width=100;
        int height=50;
        //创建对象，在内存中取出图片
        BufferedImage image=new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);//一坨黑色的


        //美化图片
        Graphics graphics = image.getGraphics();//获取画笔
        graphics.setColor(Color.PINK);
        graphics.fillRect(0,0,width,height);

        //边框
        graphics.setColor(Color.BLUE);
        graphics.drawRect(0,0,width-1,height-1);


        //写验证码
        graphics.setColor(Color.green);
//        graphics.drawString("ASDAS",20,25);

        String str="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random=new Random();

        StringBuilder sb=new StringBuilder();

        for (int i=1;i<=4;i++){
            int index = random.nextInt(str.length());
            //获取字符
            char ch= str.charAt(index);
            sb.append(ch);

            graphics.drawString(ch+"",width/5*i,height/2);
        }

        //写入session以读取验证码
        String checkCode_session=sb.toString();
        req.getSession().setAttribute("checkCode_session",checkCode_session);

        //干扰线
        graphics.setColor(Color.gray);

        for (int i=0;i<10;i++){
            int x1=random.nextInt(width);
            int y1=random.nextInt(height);

            int x2=random.nextInt(width);
            int y2=random.nextInt(height);
            graphics.drawLine(x1,y1,x2,y2);
        }

        //将图片输出到页面
        ImageIO.write(image,"jpg",resp.getOutputStream());
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }
}
