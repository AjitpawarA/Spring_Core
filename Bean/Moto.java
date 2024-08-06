package Bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

public class Moto implements Mobile{

	public void call() {
		// TODO Auto-generated method stub
		System.out.println("calling from moto mobile");
	}

}
