package config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import com.springDemo.Spring.Alien;
import com.springDemo.Spring.Computer;
import com.springDemo.Spring.Desktop;
import com.springDemo.Spring.Laptop;

@Configuration
@ComponentScan("com.springDemo.Spring")
public class AppConfig {
	
//	@Bean
//	public Alien alien(Computer com) { //@Qualifier("desktop") 
//		Alien obj = new Alien();
//		obj.setAge(25);
//		obj.setCom(com);
//		return obj;
//	}
//	
//	//@Bean(name = {"com2","desktop1"})
//	@Bean
//	//@Scope("prototype")
//	public Desktop desktop() {
//		return new Desktop();
//	}
//	
//	@Bean
//	@Primary
//	public Laptop laptop() {
//		return new Laptop();
//	}
}
