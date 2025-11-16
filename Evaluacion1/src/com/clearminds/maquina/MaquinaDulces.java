package com.clearminds.maquina;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;


public class MaquinaDulces {

	private ArrayList<Celda> celdas;
	private double Saldo;

	public MaquinaDulces() {
		celdas = new ArrayList<Celda>();
	}

	public void agregarCelda(Celda codigo) {
		celdas.add(codigo); // Agregar a la lista }
	}

	public void mostrarConfiguracion() {
		for (int i = 0; i < celdas.size(); i++) {
			Celda celdaNueva = celdas.get(i);
			System.out.println("Celda: " + celdaNueva.getCodigo());
		}
	}

	public Celda buscarCelda(String Codigo) {
		Celda buscar = null;
		for (int i = 0; i < celdas.size(); i++) {
			buscar = celdas.get(i);
			if (Codigo.equals(buscar.getCodigo())) {
				// equal ayuda a comparar el igual igual no es para String
				return buscar;
			}
		}
		return null;
	}

	public void cargarProducto(Producto Producto, String Codigo, int Stock) {

		Celda celdaRecuperada = buscarCelda(Codigo);
		celdaRecuperada.ingresarProducto(Producto, Stock);
	}

	public void mostrarProductos() {
		for (int i = 0; i < celdas.size(); i++) {
			Celda c = celdas.get(i);
			if (c.getProducto() != null) {
				System.out.println("Celda: " + c.getCodigo() + " Stock actual:" + c.getStock() + " Nombre: "
						+ c.getProducto().getNombre() + " Precio: " + c.getProducto().getPrecio());
			} else {
				System.out.println("Celda: " + c.getCodigo() + " Stock actual: 0 " + " Nombre: Sin Producto asinnado");
			}
		}
		System.out.println("Saldo: " + Saldo);
	}

	public Producto buscarProductoEnCelda(String codigoCelda) {

		// Recorremos todas las celdas de la máquina
		for (int i = 0; i < celdas.size(); i++) {

			// Tomamos la celda actual en la posición i
			Celda celdaActual = celdas.get(i);

			// Comparamos si el código que buscamos coincide con el código de esta celda
			if (codigoCelda.equals(celdaActual.getCodigo())) {

				// Si coincide, devolvemos el PRODUCTO que está dentro de esa celda
				// (puede ser papitas, galletas, etc.)
				return celdaActual.getProducto();
			}
		}

		// Si NO encontramos ninguna celda con ese código, retornamos null
		// Esto indica: "no hay producto en esa celda" o "la celda no existe"
		return null;
	}

	public double consultarPrecio(String Codigo) {
		for (int i = 0; i < celdas.size(); i++) {

			Celda celdaActual = celdas.get(i);

			// Comparamos el código de la CELDA, no del producto
			if (Codigo.equals(celdaActual.getCodigo())) {

				// Devolvemos el precio del producto dentro de esa celda
				return celdaActual.getProducto().getPrecio();
			}
		}

		return 0; // Si no encuentra la celda
	}

	public Celda buscarCeldaProducto(String Codigo) {
		for (int i = 0; i < celdas.size(); i++) {
			Celda celdaActual = celdas.get(i); // 1️⃣ Tomamos cada celda de la lista
			if (celdaActual.getProducto() != null && // 2️⃣ Verificamos que la celda tenga un producto
					Codigo.equals(celdaActual.getProducto().getCodigo())) { // 3️⃣ Comparamos el código del producto con
																			// el buscado
				return celdaActual; // 4️⃣ Si coincide, devolvemos esa celda
			}
		}
		return null; // 5️⃣ Si ninguna celda tiene el producto, devolvemos null
	}

	public void incrementarProductos(String Codigo, int Stock) {
		// Buscar la celda que contiene el producto con el código dado
		Celda celdaEncontrada = buscarCeldaProducto(Codigo);

		// Verificar que la celda y el producto dentro de ella existan
		if (celdaEncontrada != null && celdaEncontrada.getProducto() != null) {

			// Obtener el stock actual de la celda y sumarle la cantidad nueva
			int nuevoStock = celdaEncontrada.getStock() + Stock; // sumamos al stock actual

			// Guardar el nuevo stock en la celda
			celdaEncontrada.setStock(nuevoStock); // actualizamos el stock en la celda
		}
	}

	public void vender(String Celda) {
		for (int i = 0; i < celdas.size(); i++) {
			Celda celdaActual = celdas.get(i);
			// Aquí deberías comparar si esta celda es la que corresponde al código recibido
			if (celdaActual.getCodigo().equals(Celda)) {

				// Reducir el stock en 1
				int stockActual = celdaActual.getStock();
				celdaActual.setStock(stockActual - 1);

				// Sumar el precio del producto al saldo de la máquina
				double precio = celdaActual.getProducto().getPrecio();
				this.Saldo += precio;

			}
		}
	}
	
	public double venderConCambio(String Celda, double valorIngresado) {
	    // Recorremos todas las celdas de la máquina
	    for (int i = 0; i < celdas.size(); i++) {
	        Celda celdaActual = celdas.get(i);

	        // Verificamos si esta celda es la que el cliente quiere comprar
	        if (celdaActual.getCodigo().equals(Celda)) {

	            // Obtenemos el precio del producto dentro de esa celda
	            double precio = celdaActual.getProducto().getPrecio();

	            // Revisamos si el dinero ingresado es suficiente
	            if (valorIngresado < precio) {
	                System.out.println("Dinero insuficiente");
	                return valorIngresado; // devolvemos todo el dinero, no se vende
	            }

	            // Reducimos el stock en 1 porque se vendió un producto
	            celdaActual.setStock(celdaActual.getStock() - 1);

	            // Sumamos el precio del producto al saldo total de la máquina
	            this.Saldo += precio;

	            // Calculamos el cambio que se debe devolver al cliente
	            double cambio = valorIngresado - precio;
	            return cambio; // devolvemos el cambio
	        }
	    }

	    // Si no encontramos la celda con ese código, informamos y devolvemos el dinero ingresado
	    System.out.println("Celda no encontrada");
	    return valorIngresado; 
	}
	
	public ArrayList<Producto> buscarMenores(double limite) {

	    // 1️⃣ Creamos una nueva lista donde vamos a guardar
	    //    los productos que cumplen la condición.
	    ArrayList<Producto> menores = new ArrayList<>();

	    // 2️⃣ Recorremos todas las celdas que tiene la máquina.
	    for (Celda c : celdas) {

	        // 3️⃣ Verificamos que la celda tenga un producto dentro.
	        if (c.getProducto() != null) {

	            // 4️⃣ Obtenemos el producto que está en esa celda.
	            Producto p = c.getProducto();

	            // 5️⃣ Comparamos el precio del producto con el límite recibido.
	            //    Si el precio es MENOR O IGUAL al límite...
	            if (p.getPrecio() <= limite) {

	                // 6️⃣ ...lo añadimos a la lista de productos más baratos.
	                menores.add(p);
	            }
	        }
	    }

	    // 7️⃣ Finalmente retornamos la lista de productos que cumplen
	    //    con el precio menor o igual al límite.
	    return menores;
	}
}