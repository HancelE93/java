package com.krakedev.composicion.test;

import com.krakedev.composicion.AdminProducto;
import com.krakedev.composicion.Producto;

public class TestAdminProducto {

	public static void main(String[] args) {
		Producto mc;
		AdminProducto admin = new AdminProducto();
		Producto productoA = new Producto("Doritos",0.50);
		Producto prodcutoB = new Producto("Papitas",0.55);
		
		mc=admin.buscarMasCaro(productoA, prodcutoB);
		
		if(mc==null) {
			System.out.println("SOn iguales");
		}else {
		System.out.println("El mas caro es: "+mc.getNombre());
		}
		

	}

}
