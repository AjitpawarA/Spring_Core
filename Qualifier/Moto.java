package Qualifier;

import org.springframework.stereotype.Component;

@Component
public class Moto implements Mobile{

	public void call() {
		// TODO Auto-generated method stub
		System.out.println("calling from moto mobile");
	}

}
