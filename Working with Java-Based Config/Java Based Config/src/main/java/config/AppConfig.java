package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springDemo.Spring.Desktop;

@Configuration
public class AppConfig {
	
	@Bean
	public Desktop desktop() {
		return new Desktop();
	}
	
}
