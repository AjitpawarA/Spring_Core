package Qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Person {
	
	@Autowired
	@Qualifier(value = "moto")
	private Mobile mobile;
	
	public static void main(String[] args) {
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(Conf.class);
		Person person =(Person)applicationContext.getBean("person");
		person.mobile.call();
	}
}
