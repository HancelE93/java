package com.krakedev.excepciones;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Ejercicio3 {
	private static final Logger LOGGER=LogManager.getFormatterLogger(Ejercicio3.class);
	
	public void metodo1() {
		String a = null;
		try {
			a.substring(0);
		}catch(Exception io){
			System.out.println("error");
			LOGGER.error("el error a obtener la subcadena",io);
			//simore q se haga un cathc hacer esto y refenreciar con io
		}
	}
	public static void main(String[] args) {
		Ejercicio3 ej3= new Ejercicio3();
		ej3.metodo1();
	}
}
