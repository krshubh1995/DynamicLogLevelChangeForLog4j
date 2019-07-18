package krshx.log4j.example.service;

import org.apache.log4j.Level;

public interface KrshxLog4jPocService {

	public void log4jNormalScenario();
	public String log4jDyanmicLogLevelCahngeScenario();
	public Level getLogLevel();
	
}
