package com.proyecto.ejercicio;

import java.sql.SQLException;
import java.text.DateFormat;
import java.util.Date;
import java.util.Map;
import java.util.logging.Logger;

public class LoggerBD extends LoggerBase{
	
	protected Map dbParamsMap;
	private DatabaseConnection connection;
	
	public LoggerBD(Logger logger, String meesage, char logLevelParam) {
		super(logger, meesage, logLevelParam);
		generateLog();
	}

	@Override
	void generateLog() {
		
		int    t = 0;
		String l = null;
		t =  logLevelParam=='M'?1:logLevelParam=='E'?2:3;
		l += logLevelParam=='M'?"message ":logLevelParam=='E'?"error ":"warning ";
		l += DateFormat.getDateInstance(DateFormat.LONG).format(new Date()) + meesage;
	    
		try {
			connection.getInstance(dbParamsMap).getConnection().createStatement().executeUpdate("insert into Log_Values('" + l + "', " + String.valueOf(t) + ")");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
