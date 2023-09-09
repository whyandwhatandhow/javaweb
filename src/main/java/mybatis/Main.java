package mybatis;



import mybatis.domain.login;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        //加载核心配置文件
        String resource="mybatis-config.xml";
        InputStream inputStream= Resources.getResourceAsStream(resource);
        SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(inputStream);


        //获取sql
        SqlSession sqlSession = factory.openSession();
        List<login> login = sqlSession.selectList("mybatis.mapper.LoginMapper.selectAll");

        System.out.println(login);

        sqlSession.close();


    }
}
