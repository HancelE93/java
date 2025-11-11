package com.cmc.Repaso.entidades;

public class Producto {
	private String Nombre;
	private double Precio;
	
	
	public Producto( String Nombre,double Precio) {
		this.Nombre=Nombre;
		this.Precio=Precio;
	}
	
	
	public String getNombre() {
		return Nombre;
	}



	public void setNombre(String nombre) {
		Nombre = nombre;
	}



	public double getPrecio() {
		return Precio;
	}



	public void setPrecio(double precio) {
	    if (precio > 0) {
	        Precio = precio;  // Lo deja tal cual si es positivo
	    } else {
	    	Precio = precio * -1;  // Convierte el negativo en positivo      
	    }
	}
	
	 public double calcularPrecioPormo(double porcentajeDescuento) {
	        double descuento = Precio * (porcentajeDescuento / 100);
	        return Precio - descuento;
	    }
	

}
