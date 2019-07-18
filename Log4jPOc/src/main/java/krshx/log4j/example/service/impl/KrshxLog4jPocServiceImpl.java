package krshx.log4j.example.service.impl;


import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import krshx.log4j.example.service.KrshxLog4jPocService;

@Service
public class KrshxLog4jPocServiceImpl implements KrshxLog4jPocService {

  static	Logger log= Logger.getLogger(KrshxLog4jPocServiceImpl.class);;
	
	@Override
	public void log4jNormalScenario() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String log4jDyanmicLogLevelCahngeScenario() {

		// TODO Auto-generated method stub
		log.info("For info");
		log.debug("For debug");
		log.error("for error");
		log.fatal("log for fatal");
		log.warn("warnning");
		return "Success! Check Logs For dynamic change";
	}

	public Level getLogLevel() {
		return Level.ERROR;
	}
}
