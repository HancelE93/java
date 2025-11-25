package com.krakedev.herencia;

public class Persona {
	private String cedula;
	private String nombre;
	
	
	
	public Persona(String cedula, String nombre) {
		//super(); llama al constructor vacio de object ponga o no pobga
		this.cedula = cedula;
		this.nombre = nombre;
	}
	
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override //an0tacion sobre el metodo to string
	//no hace efecto si se borra o no 
	//valida y ver si viene de una sobre escritura
	public String toString() {
		return "Persona [cedula=" + cedula + ", nombre=" + nombre + "]";
	}
	
	
	
	
}
