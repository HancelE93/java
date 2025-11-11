package com.cmc.Repaso.test;

import com.cmc.Repaso.entidades.Estudiante;

public class TestEstudiante {

	public static void main(String[] args) {
	  Estudiante estudiante1 =new Estudiante("Hancel");
	  Estudiante estudiante2 =new Estudiante("Daniel");
	  
	  estudiante1.metodoCalificar(10);
	  estudiante2.metodoCalificar(5);
	  
	  estudiante1.datos();
	  estudiante2.datos();
	  
	 }

}
