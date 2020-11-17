package com.springreflectionripper.test2.aop;

import org.springframework.stereotype.Component;

@Component
public class Terminator {
    private String message = " Hello !";
    public void getMessagePrint(){
        System.out.println(message);
    }
}
