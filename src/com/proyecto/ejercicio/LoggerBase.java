package com.proyecto.ejercicio;

import java.util.Map;
import java.util.logging.Logger;

public abstract class LoggerBase {

	protected String meesage;
	protected Logger logger;
	protected char logLevelParam;
	
	public LoggerBase(Logger logger,String meesage,char logLevelParam){
		this.logger=logger;
		this.meesage=meesage;
		this.logLevelParam=logLevelParam;
	}
	
	abstract void generateLog();
	
	

}
