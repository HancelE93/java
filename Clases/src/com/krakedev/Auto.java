package com.krakedev;

public class Auto {
	private String marca;
	private int año;
	private double precio;
	
	public Auto() {
		
	}
	
	
	public Auto (String marca, int año, double precio) {
		this.marca=marca;
		this.año=año;
		this.precio=precio;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getAño() {
		return año;
	}
	public void setAño(int año) {
		this.año = año;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
}

