package Qualifier;

import org.springframework.stereotype.Component;

@Component
public class Vivo implements Mobile {

	public void call() {
		// TODO Auto-generated method stub
		System.out.println("Calling from vivo");
	}

}
