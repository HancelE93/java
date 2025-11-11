package com.cmc.Repaso.test;

import com.cmc.Repaso.entidades.Item;

public class TestItem {

	public static void main(String[] args) {
		Item it = new Item();
		Item it2 = new Item();
	
		it.setProductosActuales(20);
		it.imprimir();
		
		it2.setNombre("ps5");
		it2.setProductosActuales(10);
		it2.setProductosDevueltos(3);
		it2.setProductosVendidos(6);
		
		it2.imprimir();
		
		it.setNombre("tv");
		it.vender(5);
		it.devolver(2);
		it.imprimir();
		
	
		it2.vender(3);
		it2.devolver(1);
		it2.imprimir();
	
	}

}
