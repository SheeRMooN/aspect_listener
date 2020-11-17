package com.springreflectionripper;

import com.springreflectionripper.test2.TerminatorQuoter2;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringreflectionripperApplication {

    public static void main(String[] args) {
        //SpringApplication.run(SpringreflectionripperApplication.class, args);
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        context.getBean(TerminatorQuoter2.class).sayQuote2();
    }

}
