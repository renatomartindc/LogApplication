package com.proyecto.ejercicio;

import java.util.logging.Logger;

public abstract class JobLoggerCliente {

	protected abstract LoggerBase createLogger(Logger logger,String message,char logLevelParam);

}
