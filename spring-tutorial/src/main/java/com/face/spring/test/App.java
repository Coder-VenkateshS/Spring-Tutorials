package com.face.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

	public static void main(String[] args) {
	ApplicationContext appcontext = new FileSystemXmlApplicationContext("beans.xml");
		Person person = (Person) appcontext.getBean("person");
	person.display();

	}

}
