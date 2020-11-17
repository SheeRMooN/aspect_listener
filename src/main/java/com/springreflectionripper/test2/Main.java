package com.springreflectionripper.test2;

import com.springreflectionripper.test2.aop.Terminator;
import com.springreflectionripper.test2.punisher.CustomEventPublisher;
import com.springreflectionripper.test2.punisher.HelloHandler;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(value = "com.springreflectionripper.test2")
@Configuration
public class Main {
    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
//        context.getBean(TerminatorQuoter2.class).sayQuote2();
//        context.getBean(Terminator.class).getMessagePrint();
//
//        context.start();
//
//        context.stop();

//        context.getBean(CustomEventPublisher.class).setApplicationEventPublisher();
        context.getBean(CustomEventPublisher.class).publish();
        }
        @Bean
    public TerminatorQuoter2 mess(){
        TerminatorQuoter2 terminatorQuoter2 = new TerminatorQuoter2();
        terminatorQuoter2.setMessage("Messege");
        return terminatorQuoter2;
        }
}
