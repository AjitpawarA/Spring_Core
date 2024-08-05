package Annotations;

import org.springframework.stereotype.Component;

@Component(value="myTrainr")
public class Trainer {
	public void teach() {
		System.out.println("Trainer is teaching");
	}
}
