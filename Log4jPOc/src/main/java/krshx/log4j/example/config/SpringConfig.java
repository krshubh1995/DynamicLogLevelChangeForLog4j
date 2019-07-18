package krshx.log4j.example.config;

import javax.annotation.PostConstruct;

import org.apache.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import krshx.log4j.example.service.KrshxLog4jPocService;

@Configuration
public class SpringConfig {

	@Autowired
	KrshxLog4jPocService service;
	
	@PostConstruct
	public void init() {
		LogManager.getRootLogger().setLevel(service.getLogLevel());

	}
}
