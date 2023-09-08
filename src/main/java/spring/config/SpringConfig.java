package spring.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

@Configuration
@ComponentScan("spring")
@PropertySource("druid.properties")//加配置文件
public class SpringConfig {


@Bean
    public DataSource source(){
        DruidDataSource ds=new DruidDataSource();
        ds.setDriverClassName("root");
//        ds.setUrl();等等管理第三方bean要自己配置
        return ds;
    }
}
