package com.krakedev.ejemplomaven;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Admin {
	private static Logger logger=LogManager.getLogger(Admin.class);
	
	public void agregar() {
		logger.warn("mensaje de warm");// solo imprime los warm
		logger.info("mensaje de info");//
		logger.debug("mensaje de debug");
		logger.trace("mensaje de trace");// trace y los menores a este  u anteriores 
		logger.error("mensaje de  error");//cualquer conficugarion siempre se muestra
		
	}	
}
