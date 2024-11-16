package com.sam.spring1;

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
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	Alien obj =  context.getBean(Alien.class);
   	//obj.setAge(16);
//    	obj.code();
    	obj.build();
        //System.out.println( obj.getAge()+" : "+obj.getsalary() );
    	//System.out.println(obj.getAge());
    }
}
