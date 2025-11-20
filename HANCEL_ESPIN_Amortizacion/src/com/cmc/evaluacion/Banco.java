package com.cmc.evaluacion;

import java.util.ArrayList;
import java.util.List;

import com.cmc.evaluacion.entidades.Cliente;
import com.cmc.evaluacion.entidades.Cuota;

public class Banco {
	private ArrayList<Prestamo> prestamos;
	private ArrayList<Cliente> clientes;

	public Banco() {
		clientes = new ArrayList<>(); // Inicialización de la lista
		prestamos = new ArrayList<>();
	}

	public Cliente bucarCliente(String cedula) {

		for (int i = 0; i < clientes.size(); i++) {
			Cliente clienteCedula = clientes.get(i);

			if (clienteCedula.getCedula() != null && clienteCedula.getCedula().equals(cedula)) {
				return clienteCedula;
			}
		}
		return null;
	}

	public void registrarCliente(Cliente cliente) {
		for (int i = 0; i < clientes.size(); i++) {
			Cliente registro = clientes.get(i);

			if (registro.getCedula() != null && registro.getCedula().equals(cliente.getCedula())) {
				System.out.println("cliente ya esta registrado");
			}
		}
		clientes.add(cliente); ///para agregar un cliente recordad 
		System.out.println("Cliente registrado correctamente");
	}

	public void asignarPrestamo(String cedulaCliente, Prestamo prestamo) {

		// 1. BUSCAR AL CLIENTE USANDO FOR NORMAL (esto sí te dan)
		Cliente clienteEncontrado = null;

		for (int i = 0; i < clientes.size(); i++) {
			Cliente c = clientes.get(i); // obtenemos el cliente por índice

			if (c.getCedula().equals(cedulaCliente)) {
				clienteEncontrado = c; // lo encontramos
				break;
			}
		}

		// 2. SI NO SE ENCONTRÓ EL CLIENTE
		if (clienteEncontrado == null) {
			System.out.println("No es cliente del banco.");
			return; // termina el método
		}

		// 3. SI EXISTE → CREAMOS LA TABLA DE AMORTIZACIÓN
		ArrayList<Cuota> tabla = new ArrayList<>();

		for (int i = 1; i <= prestamo.getPlazo(); i++) {

			// Crear la cuota número i
			Cuota cuota = new Cuota(i);

			// Aquí irían tus cálculos:
			// cuota.setValorCuota(...)
			// cuota.setInteres(...)
			// etc.

			tabla.add(cuota); // agregamos cada cuota a la tabla
		}

		// 4. GUARDAMOS LA TABLA EN EL PRESTAMO (sin usar set)
		prestamo.asignarTabla(tabla);
		// dentro de Prestamo tendrás:
		// public void asignarTabla(ArrayList<Cuota> t) { this.tabla = t; }

		// 5. AGREGAMOS EL PRESTAMO AL CLIENTE (sin usar set)
		clienteEncontrado.agregarPrestamo(prestamo);
		// dentro de Cliente tendrás:
		// public void agregarPrestamo(Prestamo p) { this.prestamos.add(p); }

	}

	public ArrayList<Prestamo> buscarPrestamos(String cedula) {
	    for (int i = 0; i < clientes.size(); i++) {
	        Cliente c = clientes.get(i);

	        if (c.getCedula().equals(cedula)) { 
	            return c.getPrestamos();
	        }
	    }
	    
	    return null;
	}

	public ArrayList<Prestamo> getPrestamos() {
		return prestamos;
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

}
