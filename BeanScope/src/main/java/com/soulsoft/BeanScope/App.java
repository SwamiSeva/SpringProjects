package com.soulsoft.BeanScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
      Laptop lap1=context.getBean(Laptop.class);
      lap1.show();
      String name;
      lap1.name="Priya";
     
      System.out.println(lap1.name);
      
      Laptop lap2=context.getBean(Laptop.class);
      lap2.show();
      System.out.println(lap2.name);
      
    }
}
