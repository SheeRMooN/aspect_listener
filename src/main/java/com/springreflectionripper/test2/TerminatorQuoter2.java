package com.springreflectionripper.test2;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Profiling

public class TerminatorQuoter2 implements Quoter2 {
    @InjectRandomInt2(min = 2, max = 7)
    private int repeat;

    private String message;

    @PostConstruct
    public void init() {
        System.out.println("Phase 2");
        System.out.println(repeat);
    }

    @PreDestroy
    public void destroy(){
        System.out.println("destroy");
    }

    public TerminatorQuoter2() {
        System.out.println("Phase 1");
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void sayQuote2() {
        for (int i = 0; i < repeat; i++) {
            System.out.println("message " + message);
        }

    }
}
