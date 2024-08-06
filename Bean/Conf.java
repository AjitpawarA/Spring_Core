package Bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = "Bean")
public class Conf {
	
	
	@Bean(name ="moto" )
	public Moto getmoto() {
		return new Moto();
	}
	
	@Bean(name ="vivo" )
	public Vivo getvivo() {
		return new Vivo();
	}
	
	@Bean(name = "peroan3")
	public Peroan3 getPeroan3() {
		return new Peroan3();
	}
}
