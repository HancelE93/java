package com.kakredev.sobrecarga;

public class Bienvenida {
	public void saludar(String nombre) {
		System.out.println("Hola "+nombre );
	}
	//sobre carga de metodnos no tiene nada q ver con herencia
	//sobrecarga es mismo nombre diferentes parametros
	public void saludar(String nombre,String apellido) {
		System.out.println("Hola "+nombre+apellido );
	}
}
