package com.guri.JenIntegration;

import org.testng.annotations.Test;

public class AppTest {
   @Test
	public void firstTest(){
    {
        System.out.println( "Hello World!" );
        System.out.println(System.getProperty("username"));
    }
   }
}