package com.cmc.Repaso.test;

import com.cmc.Repaso.entidades.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto pro = new Producto("Ps5",850);
		Producto pro2=new Producto("TV",60);
		
		pro2.setPrecio(60);
		
		System.out.println(pro.getNombre());
		System.out.println(pro.getPrecio());
		
		System.out.println(pro.calcularPrecioPormo(50));
		
		System.out.println(pro2.getNombre());
		System.out.println(pro2.getPrecio());
		
		System.out.println(pro2.calcularPrecioPormo(12));
		
	}

}

