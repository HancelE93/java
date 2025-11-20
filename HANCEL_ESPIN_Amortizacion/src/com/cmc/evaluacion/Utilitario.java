package com.cmc.evaluacion;

public class Utilitario {
	// Método que redondea un número a 2 decimales
		// valor: el número que queremos redondear
		// retorna: el número redondeado a 2 decimales
		public static double redondear(double valor) {
		    // Multiplicamos por 100, redondeamos, y luego dividimos entre 100
		    return Math.round(valor * 100.0) / 100.0;
	}
}