package com.springreflectionripper.test2.punisher;

import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;


public class CustomEvent extends ApplicationEvent{

   public CustomEvent(Object source) {
      super(source);
   }
   public String toString(){
      return "My Custom Event";
   }
}