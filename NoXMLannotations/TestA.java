package NoXMLannotations;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestA {
	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext = new AnnotationConfigApplicationContext(
				myConfig.class);

		Person person = (Person) configurableApplicationContext.getBean("person");
		person.run();
		System.out.println("age :" + person.age);
		System.out.println("email:" + person.email);
		System.out.println("marks:" + person.getMarks());
		
		
		//Hamari Adhuri Kahani        
	}
}
