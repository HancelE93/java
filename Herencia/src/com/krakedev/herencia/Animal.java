package com.krakedev.herencia;

public class Animal {

	public  Animal() {
		super(); //se puede poner o no 
		System.out.println("Se ejecuta constructor vacio de Animal");
		//se ejecuta el contructor vacuio lidre es decir en este caso ANimal por que no se puso un estends
		//de igual manera se puede poner super(); o no se le pone igyal el programa lo ejecuta 
	}
	
	public void dormir() {
			System.out.println("Animal durmiendo");
	}
}
