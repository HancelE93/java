package com.krakedev.test;

import com.krakedev.demo.Producto;

public class TestProducto {

	public static void main(String[] args) {
		
		Producto producto1= new Producto (12345,"Ps5");
		producto1.setDescripcion("Consola de video juegos");
		producto1.setPrecio(750.85);
		
		System.out.println("****************************************");
		System.out.println("****************PRODUCTOS***************");
		System.out.println("****************************************");
		System.out.println("Codigo: "+producto1.getCodigo());
		System.out.println("Nombre: "+producto1.getNombre());
		System.out.println("Descripcion: "+producto1.getDescripcion());
		System.out.println("Precio: "+producto1.getPrecio());
		System.out.println("****************************************");
		

	}

}
