package com.soulsoft.SetterDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
       Laptop lap=context.getBean(Laptop.class);
      // System.out.println("The new laptop name:"+lap.getName());
       lap.show();
    }
}
