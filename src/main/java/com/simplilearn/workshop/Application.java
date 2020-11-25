package com.simplilearn.workshop;

public class Application {
     public static void main(String[] args){
    	 System.out.println(new Application().getMessage());
     }
     
     private final String message = "Welcome to Simplilearn";
     
     private String getMessage() {
    	 return message;
     }
}
