package com.ankitapatil.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class IOCApp1 {

	public static void main(String[] args) {
		// Create the application context (container) 
		ApplicationContext ctx = new FileSystemXmlApplicationContext("beans.xml");
		
		// Create th bean (Injecting the bean instance Organization using getBean method of ApplicationContext)
		Organization org = (Organization) ctx.getBean("myorg");
		
		// Invoke the bean method i.e. invoke the company slogan via the bean
		org.corporateSlogan();
		
		// Close the Application Context (container) 
		((FileSystemXmlApplicationContext) ctx).close();
		

	}

}
