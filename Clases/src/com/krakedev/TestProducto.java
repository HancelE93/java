package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		Producto p1 = new Producto();
		Producto p2 = new Producto();
		Producto p3 = new Producto();
		
		System.out.println("*****************");
		System.out.println("nombre:"+p1.nombre);
		System.out.println("descripcion:"+p1.descripcion);
		System.out.println("precio:"+p1.precio);
		System.out.println("Stock Actual:"+p1.stockActual);
		System.out.println("*****************");
		
		
		p1.nombre= "Consola";
		p1.descripcion="Sistema de entretenimiento";
		p1.precio=700;
		p1.stockActual=1;

		System.out.println("*****************");
		System.out.println("nombre:"+p1.nombre);
		System.out.println("descripcion:"+p1.descripcion);
		System.out.println("precio:"+p1.precio);
		System.out.println("Stock Actual:"+p1.stockActual);
		System.out.println("*****************");
		
		p2.nombre= "Camisetas";
		p2.descripcion="Algodon";
		p2.precio=30.50;
		p2.stockActual=5;
		
		System.out.println("*****************");
		System.out.println("nombre:"+p2.nombre);
		System.out.println("descripcion:"+p2.descripcion);
		System.out.println("precio:"+p2.precio);
		System.out.println("Stock Actual:"+p2.stockActual);
		System.out.println("*****************");
		
		p3.nombre= "Pantalones";
		p3.descripcion="Gamusa";
		p3.precio=15.75;
		p3.stockActual=3;
		
		System.out.println("*****************");
		System.out.println("nombre:"+p3.nombre);
		System.out.println("descripcion:"+p3.descripcion);
		System.out.println("precio:"+p3.precio);
		System.out.println("Stock Actual:"+p3.stockActual);
		System.out.println("*****************");
		

	}

}
