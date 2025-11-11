package com.cmc.Repaso.entidades;

public class Estudiante {
	String Nombre;
	double Nota;
	String Resultado;
	
	public Estudiante(String Nombre) {
		this.Nombre=Nombre;
	}

 public void metodoCalificar(double Nota) {
	this.Nota=Nota;
	
	 if(Nota < 8) {
		Resultado = "F";
	}else if (Nota >=8){
		Resultado = "A";
	}
 }
 public void datos() {
	System.out.println("Nombre: "+Nombre);
	System.out.println("Nota: "+Nota);
	System.out.println("Resultado: "+Resultado);
 }
}