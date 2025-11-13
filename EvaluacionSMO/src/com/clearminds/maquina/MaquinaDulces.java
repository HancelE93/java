package com.clearminds.maquina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private Celda Celda1;
	private Celda Celda2;
	private Celda Celda3;
	private Celda Celda4;
	private double Saldo;

	public Celda getCelda1() {
		return Celda1;
	}

	public void setCelda1(Celda celda1) {
		Celda1 = celda1;
	}

	public Celda getCelda2() {
		return Celda2;
	}

	public void setCelda2(Celda celda2) {
		Celda2 = celda2;
	}

	public Celda getCelda3() {
		return Celda3;
	}

	public void setCelda3(Celda celda3) {
		Celda3 = celda3;
	}

	public Celda getCelda4() {
		return Celda4;
	}

	public void setCelda4(Celda celda4) {
		Celda4 = celda4;
	}

	public double getSaldo() {
		return Saldo;
	}

	public void setSaldo(double saldo) {
		Saldo = saldo;
	}

	public void configurarMaquina(String Codigo1, String Codigo2, String Codigo3, String Codigo4) {
		this.Celda1 = new Celda(Codigo1);
		this.Celda2 = new Celda(Codigo2);
		this.Celda3 = new Celda(Codigo3);
		this.Celda4 = new Celda(Codigo4);
	}

	public void mostrarConfiguracion() {
		System.out.println("Codigo 1: " + Celda1.getCodigo() + " Codigo 2: " + Celda2.getCodigo() + " Codigo 3: "
				+ Celda3.getCodigo() + " Codigo 4: " + Celda4.getCodigo());
	}
	
	// Método buscarCelda según el enunciado
	// 🔹 Recibe un código de celda (String codigo)
	// 🔹 Retorna la Celda que tenga ese código
	// 🔹 Si ninguna celda coincide, retorna null
	public Celda buscarCelda(String codigo) {

	    // 🔹 Comprobamos si la primera celda existe y su código coincide con el recibido
	    // '==' compara referencias de String (no su contenido)
	    if (Celda1.getCodigo() == codigo) {
	        return Celda1; // si coincide, retornamos la celda completa
	    }

	    // 🔹 Comprobamos la segunda celda
	    if (Celda2.getCodigo() == codigo) {
	        return Celda2; // retorna la celda completa si coincide
	    }

	    // 🔹 Comprobamos la tercera celda
	    if (Celda3.getCodigo() == codigo) {
	        return Celda3; // retorna la celda completa si coincide
	    }

	    // 🔹 Comprobamos la cuarta celda
	    if (Celda4.getCodigo() == codigo) {
	        return Celda4; // retorna la celda completa si coincide
	    }

	    // 🔹 Si ninguna de las celdas coincide con el código recibido
	    return null; // significa que no existe la celda con ese código
	}
	
	// Método que permite cargar un producto en una celda específica
	// 🔹 Recibe un producto, un código de celda y la cantidad de ítems a colocar inicialmente
	// 🔹 Invoca el método buscarCelda
	// 🔹 Guarda el retorno en una variable celdaRecuperada de tipo Celda
	// 🔹 En la celda recuperada, agrega el producto y el stock inicial usando ingresarProducto
	// 🔹 No tiene retorno
	public void cargarProducto(Producto producto, String codigoCelda, int cantidadInicial) {
	    // Invocamos el método buscarCelda y guardamos el resultado en celdaRecuperada
	    Celda celdaRecuperada = buscarCelda(codigoCelda);
	    
	    // En la celda recuperada agregamos el producto y el stock inicial
	    celdaRecuperada.ingresarProducto(producto, cantidadInicial);
	}
	
	public void mostrarProductos() {
	    // Celda1
	    if (Celda1 != null && Celda1.getProducto() != null) {
	        System.out.println("Celda1 → " + Celda1.getCodigo() +
	                           ", stock " + Celda1.getStock() +
	                           ", nombre \"" + Celda1.getProducto().getNombre() +
	                           "\", producto " + Celda1.getProducto().getPrecio() +
	                           ", codigo " + Celda1.getProducto().getCodigo());
	    } else {
	        System.out.println("Celda1 → stock 0, celda no tiene productos");
	    }

	    // Celda2
	    if (Celda2 != null && Celda2.getProducto() != null) {
	        System.out.println("Celda2 → " + Celda2.getCodigo() +
	                           ", stock " + Celda2.getStock() +
	                           ", nombre \"" + Celda2.getProducto().getNombre() +
	                           "\", producto " + Celda2.getProducto().getPrecio() +
	                           ", codigo " + Celda2.getProducto().getCodigo());
	    } else {
	        System.out.println("Celda2 → stock 0, celda no tiene productos");
	    }

	    // Celda3
	    if (Celda3 != null && Celda3.getProducto() != null) {
	        System.out.println("Celda3 → " + Celda3.getCodigo() +
	                           ", stock " + Celda3.getStock() +
	                           ", nombre \"" + Celda3.getProducto().getNombre() +
	                           "\", producto " + Celda3.getProducto().getPrecio() +
	                           ", codigo " + Celda3.getProducto().getCodigo());
	    } else {
	        System.out.println("Celda3 → stock 0, celda no tiene productos");
	    }

	    // Celda4
	    if (Celda4 != null && Celda4.getProducto() != null) {
	        System.out.println("Celda4 → " + Celda4.getCodigo() +
	                           ", stock " + Celda4.getStock() +
	                           ", nombre \"" + Celda4.getProducto().getNombre() +
	                           "\", producto " + Celda4.getProducto().getPrecio() +
	                           ", codigo " + Celda4.getProducto().getCodigo());
	    } else {
	        System.out.println("Celda4 → stock 0, celda no tiene productos");
	    }

	    // Mostrar saldo de la máquina
	    System.out.println("Saldo máquina: " + Saldo);
	}


	
	// 🔹 Método: buscarProductoEnCelda
	// 🔸 Enunciado:
	// "Recibe el código de la celda y retorna el producto guardado en esa celda.
	// Si no existe la celda, retornamos null."

	public Producto buscarProductoEnCelda(String codigo) {

	    // 🔹 Paso 1: Buscar la celda con el código recibido
	    // Usamos el método buscarCelda(codigo), que revisa todas las celdas de la máquina
	    // y devuelve la celda que coincida con el código indicado.
	    Celda celdaRecuperada = buscarCelda(codigo);

	    // 🔹 Paso 2: Verificar si la celda existe
	    // Si buscarCelda no encontró ninguna celda, devuelve null.
	    // En ese caso, este método también debe devolver null.
	    if (celdaRecuperada != null) {

	        // 🔹 Paso 3: Si la celda sí existe,
	        // devolvemos el producto que está guardado dentro de esa celda.
	        // Ejemplo: si la celda A1 tiene una “Galleta”, devuelve ese producto.
	        return celdaRecuperada.getProducto();
	    }

	    // 🔹 Paso 4: Si no existe la celda con ese código,
	    // retornamos null, cumpliendo exactamente con el enunciado.
	    return null;
	}
	
	public  double consultarPrecio(String Codigo) {
		Celda celdaRecuperada = buscarCelda(Codigo);
		if (celdaRecuperada != null) {
			return celdaRecuperada.getProducto().getPrecio();
	    }else {
	    	 return 0;
	    }	
	}
	
	public Celda buscarCeldaProducto(String codigoProducto) {

	    if (Celda1.getProducto() != null &&
	        Celda1.getProducto().getCodigo() == codigoProducto) {
	        return Celda1;
	    }

	    if (Celda2.getProducto() != null &&
	        Celda2.getProducto().getCodigo() == codigoProducto) {
	        return Celda2;
	    }

	    if (Celda3.getProducto() != null &&
	        Celda3.getProducto().getCodigo() == codigoProducto) {
	        return Celda3;
	    }

	    if (Celda4.getProducto() != null &&
	        Celda4.getProducto().getCodigo() == codigoProducto) {
	        return Celda4;
	    }

	    return null;
	}
	
	public void incrementarProductos(String codigoProducto, int Stock) {

	    // Buscar la celda que contiene ese producto
	    Celda celdaEncontrada = buscarCeldaProducto(codigoProducto);

	    // Si la celda existe
	    if (celdaEncontrada != null) {

	        // Obtener el stock actual
	        int stockActual = celdaEncontrada.getStock();

	        // Sumar el stock recibido
	        int nuevoStock = stockActual + Stock;

	        // Guardar el nuevo stock en la celda
	        celdaEncontrada.setStock(nuevoStock);
	    }
	}
	    
	public void vender(String codigoCelda) {

	    // 1. Buscar la celda por su código (A1, B2...)
	    Celda celdaEncontrada = buscarCelda(codigoCelda);

	    // 2. Validar que exista
	    if (celdaEncontrada != null) {

	        // 3. Obtener el stock actual
	        int stockActual = celdaEncontrada.getStock();

	        // 4. Disminuir el stock en 1
	        celdaEncontrada.setStock(stockActual - 1);

	        // 5. Obtener el precio del producto dentro de esa celda
	        double precio = celdaEncontrada.getProducto().getPrecio();

	        // 6. Sumar ese precio al saldo de la máquina
	        Saldo += precio;
	    }
	}
	
	public double venderConCambio(String codigoCelda, double valorIngresado) {
	    // 1. Buscar la celda por codigo
	    Celda celdaEncontrada = buscarCelda(codigoCelda);

	    // Si no existe, retornar 0 o manejar error
	    if (celdaEncontrada == null) {
	        System.out.println("Celda no encontrada");
	        return 0;
	    }

	    // 2. Obtener producto y precio
	    Producto producto = celdaEncontrada.getProducto();
	    double precio = producto.getPrecio();

	    // 3. Verificar que el cliente haya ingresado suficiente dinero
	    if (valorIngresado < precio) {
	        System.out.println("Dinero insuficiente");
	        return valorIngresado; // se devuelve todo porque no alcanza
	    }

	    // 4. Restar 1 al stock
	    int stockActual = celdaEncontrada.getStock();
	    celdaEncontrada.setStock(stockActual - 1);

	    // 5. Modificar el saldo de la máquina
	    this.Saldo += precio;

	    // 6. Calcular cambio
	    double cambio = valorIngresado - precio;

	    // 7. Retornar cambio
	    return cambio;
	}

	
	
	
}



