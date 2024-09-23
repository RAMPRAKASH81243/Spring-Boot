package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.springDemo.Spring.Alien;
import com.springDemo.Spring.Computer;
import com.springDemo.Spring.Desktop;

@Configuration
public class AppConfig {
	
	@Bean
	public Alien alien(Computer com) {
		Alien obj = new Alien();
		obj.setAge(25);
		obj.setCom(com);
		return obj;
	}
	
	//@Bean(name = {"com2","desktop1"})
	@Bean
	//@Scope("prototype")
	public Desktop desktop() {
		return new Desktop();
	}
	
}
