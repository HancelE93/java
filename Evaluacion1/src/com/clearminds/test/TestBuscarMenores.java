package com.clearminds.test;
import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;


public class TestBuscarMenores {

	public static void main(String[] args) {


		MaquinaDulces m = new MaquinaDulces();
		// 👉 Aquí creas una nueva máquina expendedora vacía.
//		    La máquina NO tiene productos todavía, solo está inicializada.


		/* ────────────────────────────────────────────────
		   1️⃣ CREAR 6 CELDAS
		   Cada celda es un compartimento donde va un producto.
		   ──────────────────────────────────────────────── */

		m.agregarCelda(new Celda("A1")); // Crea celda A1 y la agrega a la máquina
		m.agregarCelda(new Celda("A2")); // Crea celda A2
		m.agregarCelda(new Celda("A3")); // Crea celda A3
		m.agregarCelda(new Celda("B1")); // Crea celda B1
		m.agregarCelda(new Celda("B2")); // Crea celda B2
		m.agregarCelda(new Celda("B3")); // Crea celda B3

		// 👉 Hasta aquí tu máquina ya tiene 6 celdas, pero aún están vacías,
//		    sin productos dentro.


		/* ────────────────────────────────────────────────
		   2️⃣ CARGAR PRODUCTOS EN LAS CELDAS
		   Cada producto se coloca dentro de una celda específica.
		   ──────────────────────────────────────────────── */

		m.cargarProducto(new Producto("Papitas", "P1", 0.85), "A1", 5);
		// 👉 Crea el producto Papitas
//		    Lo coloca en la celda A1
//		    Le pone stock = 5 unidades

		m.cargarProducto(new Producto("Doritos", "P2", 0.50), "A2", 5);
		// 👉 Crea Doritos y lo coloca en la celda A2

		m.cargarProducto(new Producto("Jet", "P3", 0.25), "A3", 5);
		// 👉 Crea Jet y lo coloca en la celda A3

		m.cargarProducto(new Producto("DeTodito", "P4", 1.60), "B1", 5);
		// 👉 Crea DeTodito y lo coloca en la celda B1

		m.cargarProducto(new Producto("Chocolate", "P5", 1.20), "B2", 5);
		// 👉 Crea Chocolate y lo coloca en la celda B2

		m.cargarProducto(new Producto("Galletas", "P6", 0.60), "B3", 5);
		// 👉 Crea Galletas y lo coloca en la celda B3

		// 👉 Ahora tu máquina tiene las 6 celdas llenas de productos,
//		    cada una con su precio y stock.


		/* ────────────────────────────────────────────────
		   3️⃣ BUSCAR PRODUCTOS MÁS BARATOS QUE EL LÍMITE
		   buscamos productos con precio <= 1.00
		   ──────────────────────────────────────────────── */

		ArrayList<Producto> lista = m.buscarMenores(1.00);
		// 👉 La máquina revisa TODAS sus celdas
		// 👉 Toma el producto de cada celda
		// 👉 Si cuesta 1.00 o menos, lo agrega a la lista
		// 👉 La lista final tiene solo productos baratos


		/* ────────────────────────────────────────────────
		   4️⃣ IMPRIMIR RESULTADOS
		   ──────────────────────────────────────────────── */

		System.out.println("Productos Menores: " + lista.size());
		// 👉 Imprime cuántos productos cumplen el criterio

		for (Producto p : lista) {
		    System.out.println("Nombre:" + p.getNombre() + " Precio:" + p.getPrecio());
		    // 👉 Imprime cada producto barato: nombre y precio
		}
}
}