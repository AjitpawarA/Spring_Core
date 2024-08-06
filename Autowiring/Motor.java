package Autowiring;

import org.springframework.stereotype.Component;

@Component
public class Motor {
	public void motostart() {
		System.out.println("motor started running");
	}
}
