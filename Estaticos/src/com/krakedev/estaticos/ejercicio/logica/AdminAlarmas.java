package com.krakedev.estaticos.ejercicio.logica;

import java.util.ArrayList;

import com.krakedev.estaticos.ejercicio.entidades.Alarma;

public class AdminAlarmas {
	ArrayList<Alarma> alarmas;

	// Constructor
	public AdminAlarmas() {
		alarmas = new ArrayList<>(); // inicializamos la lista no olvidarse del constructor
	}
	
	

	public ArrayList<Alarma> getAlarmas() {
		return alarmas;
	}



	public void agregarAlarmas(Alarma alarma) {
		alarmas.add(alarma);
	}
}
