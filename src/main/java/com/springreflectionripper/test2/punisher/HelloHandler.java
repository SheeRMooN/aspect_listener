package com.springreflectionripper.test2.punisher;

public class HelloHandler {
   private String message;

   public void setMessage(String message){
      this.message  = message;
   }
   public void getMessagePr(String message){
      System.out.println("Your Message : " + message);
   }
}