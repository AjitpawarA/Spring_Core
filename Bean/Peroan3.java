package Bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

public class Peroan3 {
	
	@Autowired
	@Qualifier(value = "moto")
	private Mobile mobile;
	
	public static void main(String[] args) {
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(Conf.class);
		Peroan3 person =(Peroan3)applicationContext.getBean("peroan3");
		person.mobile.call();
	}
}
