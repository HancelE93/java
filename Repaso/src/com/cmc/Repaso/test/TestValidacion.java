package com.cmc.Repaso.test;

import com.cmc.Repaso.entidades.Validacion;

public class TestValidacion {

	public static void main(String[] args) {
		Validacion validacion= new Validacion();

		double monto1=100;

		double monto2=50;

		double monto3=300;
	
	 
	 System.out.println("Monto 1 (" + monto1 + ") válido: " + validacion.validarMonto(monto1));
	 System.out.println("Monto 2 (" + monto2 + ") válido: " + validacion.validarMonto(monto2));
	 System.out.println("Monto 3 (" + monto3 + ") válido: " + validacion.validarMonto(monto3));
	 
	 
	 
	 System.out.println("Monto "+validacion.validarMonto(100));
	 System.out.println("Monto "+validacion.validarMonto(0));
	 System.out.println("Monto "+validacion.validarMonto(80));
	 
	}

}
