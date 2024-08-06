package Qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Person1 {
	
	private Mobile mobile;
	
	@Autowired
	public Person1(@Qualifier(value = "vivo") Mobile mobile) {
		super();
		this.mobile = mobile;
	}

	public static void main(String[] args) {
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(Conf.class);
		Person1 person =(Person1)applicationContext.getBean("person1");
		person.mobile.call();
	}
}
