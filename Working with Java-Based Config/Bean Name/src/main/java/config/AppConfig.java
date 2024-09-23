package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springDemo.Spring.Desktop;

@Configuration
public class AppConfig {
	
	//@Bean(name = {"com2","desktop1"})
	@Bean
	public Desktop desktop() {
		return new Desktop();
	}
	
}
