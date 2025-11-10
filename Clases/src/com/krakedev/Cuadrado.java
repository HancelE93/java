package com.krakedev;

public class Cuadrado {

	private int lado;
	
	public Cuadrado () {
		
	}
	
	public Cuadrado(int lado) {
		this.lado=lado;
	}
	
	public int getLado() {
		return lado;
	}
	public void setLado(int lado) {
		this.lado = lado;
	}
	
	public double getArea() {
		double area= lado * lado;
		return area;
	}
	
	
	public double getPerimetro() {
		double perimetro= lado * 4;
		return perimetro;

	}	
}
