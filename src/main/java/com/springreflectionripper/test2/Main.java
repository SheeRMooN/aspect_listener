package com.springreflectionripper.test2;

import com.springreflectionripper.test2.aop.Terminator;
import com.springreflectionripper.test2.punisher.CustomEventPublisher;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(value = "com.springreflectionripper.test2")
@Configuration
public class Main {
    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);

        context.getBean(TerminatorQuoter2.class).sayQuote2();//step1

        context.getBean(Terminator.class).getMessagePrint();//step2

        //step3
        context.start();
        context.getBean(CustomEventPublisher.class).publish();
        context.stop();

    }

    @Bean //bean for init message
    public TerminatorQuoter2 mess() {
        TerminatorQuoter2 terminatorQuoter2 = new TerminatorQuoter2();
        terminatorQuoter2.setMessage("Message");
        return terminatorQuoter2;
    }
}
