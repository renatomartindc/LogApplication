package com.proyecto.ejercicio;

import java.util.logging.Logger;

public class JobLoggerClienteConsole extends JobLoggerCliente {
	
	protected LoggerBase createLogger(Logger logger,String message,char logLevelParam){
		
		return new LoggerConsole(logger,message,logLevelParam);
	}

}
