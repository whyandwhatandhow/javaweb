package spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.config.SpringConfig;
import spring.service.AnnocationService;

public class MainTest5 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
        AnnocationService service=context.getBean(AnnocationService.class);
        service.sout();
    }
}
