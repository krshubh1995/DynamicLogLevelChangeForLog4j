package krshx.log4j.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import krshx.log4j.example.service.KrshxLog4jPocService;

@RestController
public class KrshxLog4JPocController {


	@Autowired
	KrshxLog4jPocService service;

	public void log4jNormalScenario() {

	}

	@GetMapping("/dynamiclog")
	public String log4jDynamicLevelChangeScenario() {
		return service.log4jDyanmicLogLevelCahngeScenario();
	}
}
