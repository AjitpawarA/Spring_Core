package Autowiring;

import org.springframework.stereotype.Component;

@Component
public class Battery {
	public void charge() {
		System.out.println("Battery is fully charged");
	}
}
