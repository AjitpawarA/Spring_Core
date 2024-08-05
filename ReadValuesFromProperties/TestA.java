package ReadValuesFromProperties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestA {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("readFromProperties.xml");
		Mobile mobile=(Mobile) applicationContext.getBean("myMobile");
		mobile.displayMobile();
	}
}
