package com.example.springdemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

@SpringBootApplication
public class SpringDemoApplication {

    public static void main(String[] args) {
//        SpringApplication.run(SpringDemoApplication.class, args);

        BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));

//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Triangle triangle = (Triangle) factory.getBean("triangle");

        triangle.draw();
    }

}
