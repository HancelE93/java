package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		Producto p1 = new Producto();
		Producto p2 = new Producto();
		Producto p3 = new Producto();
		
		System.out.println("*****************");
		System.out.println("nombre:"+p1.getNombre());
		System.out.println("descripcion:"+p1.getDescripcion());
		System.out.println("precio:"+p1.getPrecio());
		System.out.println("Stock Actual:"+p1.getStockActual());
		System.out.println("*****************");
		
		
		p1.setNombre("Consola");
		p1.setDescripcion("Sistema de entretenimiento");
		p1.setPrecio(700);
		p1.setStockActual(1);

		System.out.println("*****************");
		System.out.println("nombre:"+p1.getNombre());
		System.out.println("descripcion:"+p1.getDescripcion());
		System.out.println("precio:"+p1.getPrecio());
		System.out.println("Stock Actual:"+p1.getStockActual());
		System.out.println("*****************");
		
		p2.setNombre("Camisetas");
		p2.setDescripcion("Algodon");
		p2.setPrecio(30.50);
		p2.setStockActual(5);
		
		
		System.out.println("*****************");
		System.out.println("nombre:"+p2.getNombre());
		System.out.println("descripcion:"+p2.getDescripcion());
		System.out.println("precio:"+p2.getPrecio());
		System.out.println("Stock Actual:"+p2.getStockActual());
		System.out.println("*****************");
		
		p3.setNombre("Pantalones");
		p3.setDescripcion("Gamusa");
		p3.setPrecio(15.75);
		p3.setStockActual(3);
		
		System.out.println("*****************");
		System.out.println("nombre:"+p3.getNombre());
		System.out.println("descripcion:"+p3.getDescripcion());
		System.out.println("precio:"+p3.getPrecio());
		System.out.println("Stock Actual:"+p3.getStockActual());
		System.out.println("*****************");
		

	}

}
