package com.clearminds.componentes;

public class Celda {
	// 🔹 Estos son los ATRIBUTOS de la clase:
	// Representan los datos que cada Celda tiene internamente.
	private Producto Producto;  // atributo donde se guardará el producto
	private int Stock;          // atributo donde se guardará la cantidad
	private String Codigo;      // otro atributo (no usado aún)

	/*
	 * 🔸 Enunciado: "crear el método ingresarProducto que no retorna nada..."
	 *   → Por eso el método tiene tipo 'void' (no devuelve nada)
	 * 
	 * 🔸 "...pero recibe el producto y el stock inicial..."
	 *   → Por eso entre paréntesis recibe (Producto producto, int stock)
	 *     Es decir, recibe un objeto Producto y una cantidad inicial.
	 * 
	 * 🔸 "...colocar los valores en los atributos producto y stock respectivamente."
	 *   → Dentro del método usamos 'this' para asignar lo recibido a los atributos.
	 */
	
	public void ingresarProducto(Producto Producto, int Stock) {
		// Aquí guardamos en los atributos los valores que llegan como parámetros:
		this.Producto = Producto;  // asigna el producto recibido al atributo 'producto'
		this.Stock = Stock;        // asigna el stock recibido al atributo 'stock'
	}

	public Celda(String Codigo) {
		this.Codigo = Codigo;
	}

	public Producto getProducto() {
		return Producto;
	}

	public void setProducto(Producto Producto) {
		this.Producto = Producto;
	}

	public int getStock() {
		return Stock;
	}

	public void setStock(int Stock) {
		this.Stock = Stock;
	}

	public String getCodigo() {
		return Codigo;
	}

	public void setCodigo(String Codigo) {
		this.Codigo = Codigo;
	}
	
	
	
	
	
}
