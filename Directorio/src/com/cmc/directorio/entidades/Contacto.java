package com.cmc.directorio.entidades;

public class Contacto {
	private String nombre;
	private String apellido;
	boolean activo;
	Telefono telefono;
	private double peso;
	
	public Contacto(String nombre, String apellido, Telefono telefono, double peso) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.peso = peso;
	}
	
	
	
	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public double getPeso() {
		return peso;
	}



	public void setPeso(double peso) {
		this.peso = peso;
	}



	public void imprimir() {
		
		System.out.println("nombre: "+nombre+" apelldio: "+apellido+" telefono: "+telefono.getOperador()+" telefono: "+ telefono.getNumero()+ " peso: "+peso+" Activo: "+activo);
	}
	
	
	
}
