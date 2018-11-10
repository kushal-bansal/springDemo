package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainapp {
	   public static void main(String[] args) {
		      ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		      helloworld objA=(helloworld)context.getBean("helloworld");
		      objA.setMessage("A as message");
		      objA.getMessage();
		      
		      helloworld objB=(helloworld)context.getBean("helloworld");
		      //objB.setMessage("B as message");

		      objB.getMessage();
		      helloworld objC =(helloworld)context.getBean("helloworld");
		      objC.getMessage();

		   }

}
