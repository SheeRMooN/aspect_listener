package com.springreflectionripper.test2;



import org.springframework.stereotype.Component;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Component
public @interface InjectRandomInt2 {
    int min();
    int max();
}
