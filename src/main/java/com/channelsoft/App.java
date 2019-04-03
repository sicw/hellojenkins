package com.channelsoft;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring-config.xml");
        HelloWorld hw = (HelloWorld) ctx.getBean("hello");
        hw.say();
    }
}
