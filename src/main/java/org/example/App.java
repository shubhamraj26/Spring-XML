package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //create a container
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        Alien obj= (Alien) context.getBean("alien");
        obj.code();
//        System.out.println( "Hello World!" );
    }
}
