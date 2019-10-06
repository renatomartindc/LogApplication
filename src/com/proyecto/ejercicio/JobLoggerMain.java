package com.proyecto.ejercicio;

import java.util.logging.Logger;

import org.junit.Test;

public class JobLoggerMain {

	@Test
	public void getMessage(){
		
		JobLoggerCliente cliente1;
		cliente1 = new JobLoggerClienteConsole();
		Logger logger = Logger.getLogger("MyLog");
		cliente1.createLogger(logger,"testeando mensaje Console",'M');
		
		/*Crear archivo properties, luego descomentar
		JobLoggerCliente cliente2;
		cliente2 = new JobLoggerClienteBD();
		cliente2.createLogger(logger, "testeando mensaje en BD", 'E');
		JobLoggerCliente cliente3;
		cliente3 = new JobLoggerClienteFile();
		cliente3.createLogger(logger, "testeando mensaje en File", 'W');
		*/
		
	}
}
