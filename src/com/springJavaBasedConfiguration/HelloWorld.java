package com.springJavaBasedConfiguration;

public class HelloWorld {
	   private String message;
	   private Test test;

	   public HelloWorld(Test test){
		   this.test=test;
	   }
	   public void setMessage(String message){
	      this.message  = message;
	   }
	   public void getMessage(){
	      System.out.println("Your Message : " + message);
	   }
	   public void testValue(){
		   test.getName();
	   }
	}
