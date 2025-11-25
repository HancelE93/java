package com.krakedev.herencia;

public class Perro extends Animal {
	
	public Perro() {
		super();// mmalada al constuctro vacio del lider
		System.out.println("Se ejecuta constructor vacio de perro");
	}
	
	
	public void ladrar() {
		System.out.println("Perro ladrando");
	}
	
	//sobreescribir 
	@Override
	public void dormir () {
		super.dormir(); // puedo reutilizar el codigo del padre de herencia y agregar algo mas que desee
		System.out.println("Perro durmiendo");
		//si sobre escribimos hce solo caso o ejecuta al metodo que esta sobre escrito
	}
}
