package com.proyecto.ejercicio;

import java.util.logging.Logger;

public class JobLoggerClienteBD extends JobLoggerCliente {

	@Override
	protected LoggerBase createLogger(Logger logger, String message,
			char logLevelParam) {
		return new LoggerBD(logger, message, logLevelParam);
	}
	
}
