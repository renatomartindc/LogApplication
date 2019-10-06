package com.proyecto.ejercicio;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerFile extends LoggerBase {

	protected Map dbParamsMap;
	
	public LoggerFile(Logger logger, String meesage, char logLevelParam) {
		super(logger, meesage, logLevelParam);
		generateLog();
	}

	@Override
	void generateLog() {
		
		File logFile = new File(dbParamsMap.get("logFileFolder") + "/logFile.txt");
		if (!logFile.exists()) {
		  try {
			logFile.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		FileHandler fh = null;
		try {
			fh = new FileHandler(dbParamsMap.get("logFileFolder") + "/logFile.txt");
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		logger.addHandler(fh);
		Level level = logLevelParam=='M'? Level.INFO : logLevelParam=='E'?Level.SEVERE : Level.WARNING;
		logger.log(level, meesage);
		
	}
	
	

}
