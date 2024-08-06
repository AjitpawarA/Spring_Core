package NoXMLannotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
	
	@Value(value = "21")
	int age;

	String email;
	
	public Person(@Value(value = "pawarac18@gmail.com") String email) {
		this.email = email;
	}

	int marks;
	

	public int getMarks() {
		return marks;
	}

	@Value(value = "150")
	public void setMarks(int marks) {
		this.marks = marks;
	}


	public void run() {
		System.out.println("person is runnging");
	}
}
