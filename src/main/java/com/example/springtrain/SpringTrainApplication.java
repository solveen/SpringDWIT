package com.example.springtrain;

import Beans.StudentBean;
import BeansAddition.Addition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringTrainApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringTrainApplication.class, args);
        // ApplicationContext chai interface ho jun bata chai ioc container le value represent garxa
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
        //type cast to string StudentBean
        StudentBean bean = (StudentBean) context.getBean("sBean");
        StudentBean bean1 = (StudentBean) context.getBean("soBean");
        System.out.println(bean);
        System.out.println(bean1);
    }
}
