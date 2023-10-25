package main;

import beans.MyBean;
import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            //by type
            MyBean b1 = context.getBean("myBean1",MyBean.class);
            MyBean b2 = context.getBean("myBean2",MyBean.class);
            MyBean b3 = context.getBean("myBean1",MyBean.class);
            System.out.println(b1);
            System.out.println(b2);
            System.out.println(b3);
        }
    }
}
