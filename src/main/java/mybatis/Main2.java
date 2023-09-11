package mybatis;

import mybatis.domain.login;
import mybatis.mapper.LoginMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class Main2 {
    public static void main(String[] args) throws IOException {
        //加载核心配置文件
        String resource= "mybatis-config.xml.bak";
        InputStream inputStream= Resources.getResourceAsStream(resource);
        SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(inputStream);


        SqlSession sqlSession = factory.openSession();
        login login = sqlSession.getMapper(LoginMapper.class).selectById("ymd");
        System.out.println(login);
    }
}
