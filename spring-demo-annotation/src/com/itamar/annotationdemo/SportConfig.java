package com.itamar.annotationdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.itamar.annotationdemo")
@PropertySource("classpath:prop.properties")
public class SportConfig {

	@Bean
	public LiteFortuneService liteFortuneService() {
		return new LiteFortuneService();
	}
	@Bean
	public PingpongCoach pingpongCoach() {
		return new PingpongCoach(liteFortuneService());
	}

	// define bean for sad fortune service
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}

	// define bean for swim coach and inject fortune dependency
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}

}
