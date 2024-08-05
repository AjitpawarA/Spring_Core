package Annotations;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TsetA {
	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext=new ClassPathXmlApplicationContext("annotations.xml");
	
		Person person=(Person)configurableApplicationContext.getBean("person");
		person.run();
		System.err.println("Age :"+ person.age);
		System.err.println("Marks :"+ person.marks);
		System.err.println("Name :"+ person.name);
		System.out.println("email: "+person.getEmail());
		System.out.println("ID: "+ person.getPersonid());
		
		
		Trainer trainer = (Trainer) configurableApplicationContext.getBean("myTrainr");
		trainer.teach();
	}
}
