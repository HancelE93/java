package com.cmc.Repaso.entidades;

public class Item {
	private String Nombre;
	private int productosActuales;
	private int productosDevueltos;
	private int productosVendidos;
	
	public void imprimir() {
		System.out.println("********************************");
		System.out.println("Nombre: "+Nombre);
		System.out.println("Actuales: "+productosActuales);
		System.out.println("Devueltos: "+productosDevueltos);
		System.out.println("Vendidos: "+productosVendidos);
		System.out.println("********************************");
	}
	
	public void vender(int cantidad) {
	
		if(cantidad <= productosActuales) {
			productosActuales -= cantidad;
			productosVendidos += cantidad;
		}else {
			System.out.println("No hay suficientes Productos");
		}
	}
	
	public void devolver(int cantidad) {
		if(cantidad <= productosVendidos) {
		productosActuales += cantidad;
		productosVendidos -= cantidad;
		productosDevueltos += cantidad;
		}else {
		System.out.println("No hay suficientes Productos");
		}
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public int getProductosActuales() {
		return productosActuales;
	}

	public void setProductosActuales(int productosActuales) {
		this.productosActuales = productosActuales;
	}

	public int getProductosDevueltos() {
		return productosDevueltos;
	}

	public void setProductosDevueltos(int productosDevueltos) {
		this.productosDevueltos = productosDevueltos;
	}

	public int getProductosVendidos() {
		return productosVendidos;
	}

	public void setProductosVendidos(int productosVendidos) {
		this.productosVendidos = productosVendidos;
	}
	
	
	
}	
