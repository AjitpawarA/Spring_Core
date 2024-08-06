package Qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Person2 {

	private Mobile mobile;

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Conf.class);
		Person2 person = (Person2) applicationContext.getBean("person2");
		person.mobile.call();
	}

	public Mobile getMobile() {
		return mobile;
	}

	@Autowired
	public void setMobile(@Qualifier(value = "moto") Mobile mobile) {
		this.mobile = mobile;
	}
}
