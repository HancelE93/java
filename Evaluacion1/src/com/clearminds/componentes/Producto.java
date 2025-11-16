package com.clearminds.componentes;

public class Producto {
	String Codigo;
	String Nombre;
	double precio;
	

	public Producto(String codigo,String nombre, double precio) {
		this.Codigo = codigo;
		this.Nombre = nombre;
		this.precio = precio;
		
	}

	// Método que aplica un incremento en porcentaje al precio
	public void incrementarPrecio(int porcentaje) {
		// Calculamos el incremento
		double incremento = precio * porcentaje / 100.0;
		// Sumamos al precio actual
		precio += incremento;
	}

	public void disminuirPrecio(double descuento) {
		double disminucion = precio - descuento;
		precio = disminucion;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getCodigo() {
		return Codigo;
	}

	public void setCodigo(String codigo) {
		Codigo = codigo;
	}
	
	
}
