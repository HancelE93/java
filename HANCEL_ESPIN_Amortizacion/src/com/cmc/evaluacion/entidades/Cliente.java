package com.cmc.evaluacion.entidades;

import java.util.ArrayList;

import com.cmc.evaluacion.Prestamo;

public class Cliente {
	public String Cedula;
	public String Nombre;
	public String Apellido;
	
	// 🔥 Necesario para guardar préstamos del cliente
		private ArrayList<Prestamo> prestamos;
	
	public Cliente(String cedula, String nombre, String apellido) {
		this.Cedula = cedula;
		this.Nombre = nombre;
		this.Apellido = apellido;
		// 🔥 Inicializamos lista de préstamos
		this.prestamos = new ArrayList<>();
	}
	
	public void mostrarCliente () {
		System.out.println("Cliente registrado: "+Nombre+" [cedula= "+Cedula+"]"+","+"nombre= "+Nombre+", "+"apellido= "+Apellido);
	}
	
	// ====================================
		// 🔥 MÉTODO NECESARIO PARA EL BANCO 🔥
		// ====================================
		public void agregarPrestamo(Prestamo p) {
			this.prestamos.add(p);
		}
	
	public String getCedula() {
		return Cedula;
	}
	public void setCedula(String cedula) {
		Cedula = cedula;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public ArrayList<Prestamo> getPrestamos() {
		return prestamos;
	}

	public void setPrestamos(ArrayList<Prestamo> prestamos) {
		this.prestamos = prestamos;
	}
	
	
	
}
