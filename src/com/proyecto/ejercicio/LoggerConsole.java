package com.proyecto.ejercicio;

import java.util.Map;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerConsole extends LoggerBase {

	public LoggerConsole(Logger logger,String meesage,char logLevelParam) {
		super(logger,meesage,logLevelParam);
		generateLog();
	}

	@Override
	void generateLog() {
		ConsoleHandler ch = new ConsoleHandler();
		logger.addHandler(ch);
		Level level = logLevelParam=='M'? Level.INFO : logLevelParam=='E'?Level.SEVERE : Level.WARNING;
		logger.log(level, meesage);
	}

}
