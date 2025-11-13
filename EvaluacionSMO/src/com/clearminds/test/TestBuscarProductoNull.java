package com.clearminds.test;

import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestBuscarProductoNull {
	public static void main(String[] args) {
		MaquinaDulces maquina=new MaquinaDulces();
		maquina.configurarMaquina("A1", "A2", "B1", "B2");
		
		Producto producto=new Producto("KE34","Papitas",0.85);
		maquina.cargarProducto(producto, "B1", 4);
		
		Producto prod=maquina.buscarProductoEnCelda("A1");
		System.out.println("Producto encontrado:"+prod.getNombre());
		
		// ERROR: NullPointerException ocurre aquí
        // Según el enunciado, 'prod' puede ser null si la celda está vacía o no existe
        // En este caso, la celda A1 está vacía, por eso prod es null
        // Línea exacta que provoca el NullPointerException: System.out.println("Producto encontrado:" + prod.getNombre());
        // Variable que produce el error: prod
		
		
	}
}
