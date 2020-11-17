package com.springreflectionripper.test2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext context2 = new ClassPathXmlApplicationContext("context2.xml");
        context2.getBean(TerminatorQuoter2.class).sayQuote2();
        }
}
