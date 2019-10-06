package com.proyecto.ejercicio;

import java.util.logging.Logger;

public class JobLoggerClienteFile extends JobLoggerCliente {

	@Override
	protected LoggerBase createLogger(Logger logger, String message,
			char logLevelParam) {
		return new LoggerFile(logger, message, logLevelParam);
	}

	
	
}
