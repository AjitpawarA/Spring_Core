package Annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
	//assign value to variable
	@Value(value = "19")
	int age;
	
	
	int marks;
	String name;

	//assign value to variable via constructor
	public Person(@Value(value="150") int marks , @Value(value = "Sudesh") String name) {
		this.marks = marks;
		this.name=name;
	}
	
	String email;
	int personid;
	
	public String getEmail() {
		return email;
	}
	//assign value to variable via setters
	@Value(value = "pawarac18@gmail.com")
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPersonid() {
		return personid;
	}
	//assign value to variable via setters
	@Value(value = "1524")
	public void setPersonid(int personid) {
		this.personid = personid;
	}


	public void run() {
		System.out.println("person is runnign");
	}
}
