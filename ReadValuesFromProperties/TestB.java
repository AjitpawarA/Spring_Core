package ReadValuesFromProperties;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestB {
	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext=new ClassPathXmlApplicationContext("readFromProperties.xml");
		
		Employee employee=(Employee)applicationContext.getBean("myEmployee");
		
		applicationContext.close();
	}
}
