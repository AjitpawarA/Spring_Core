package Autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Car {

	@Autowired
	Engine engine;
	
	
	Motor motor;

	@Autowired
	public Car(Motor motor) {
		super();
		this.motor = motor;
	}
	
	public Car() {
		
	}
	
	
	Battery battery;
	
	
	public Battery getBattery() {
		return battery;
	}
	
	@Autowired
	public void setBattery(Battery battery) {
		this.battery = battery;
	}

	public void run() {
		System.out.println("Car is runnign");
	}

	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext = new AnnotationConfigApplicationContext(
				Autowireconf.class);
		Car car = (Car) configurableApplicationContext.getBean("car");

		car.run();
		car.engine.start();
		car.getBattery().charge();
	}
}
