package com.eac.bean_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EacApp {
    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigApp.class, ConfigAny.class);

        FullTimeMentor ft = container.getBean(FullTimeMentor.class);
//        PartTimeMentor pt = container.getBean(PartTimeMentor.class);
        PartTimeMentor pt = container.getBean("p1",PartTimeMentor.class);

        ft.createMentor();
        pt.createAccount();


        String str = container.getBean(String.class);
        System.out.println("str = " + str);

        Integer integer = container.getBean(Integer.class);
        System.out.println("integer = " + integer);


    }
}
