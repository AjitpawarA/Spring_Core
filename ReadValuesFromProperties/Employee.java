package ReadValuesFromProperties;

public class Employee {
	public Employee() {
		System.out.println("I am a constructor");
	}
	
	
	public void verifyinit() {
		System.out.println("This is postconstructor method");
	}
	
	public void destroy() {
		System.out.println("This is destroy method");
	}
}

