package com.krakedev.evaluacion;

import java.util.ArrayList;

public class Contacto {
	private String cedula;
	private String nombre;
	private String apellido;
	private Direccion direccion;
	private ArrayList<Telefono>telefono;
	
	public Contacto(String cedula, String nombre, String apellido) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = new ArrayList<>();  // ← IMPORTANTE
	}
	 public Contacto() {
		 telefono= new ArrayList<Telefono>(); 
	 }
	
	 public void agregarTelefono(Telefono telefonoNuevo) {

		    // telefonos es el ArrayList que pertenece a Contacto
		    // add() agrega el teléfono recibido a esa lista
		    telefono.add(telefonoNuevo);
		}
	 
	 public void mostrarTelefonos () {
		 for (int i=0;i<telefono.size();i++) {
			 Telefono mostrar=telefono.get(i);
			 if (mostrar.getEstado().equals("C")) {
				 System.out.println("Telefono con estado: "+mostrar.getEstado());
				 System.out.println(" Numero: "+ mostrar.getNumero()+" Tipo: "+mostrar.getTipo()); 
			 }
		 }
	 }
	 
	 public ArrayList<Telefono> recuperarIncorrectos() {

		    // 1️⃣ Crear una nueva lista para guardar los teléfonos incorrectos
		    ArrayList<Telefono> incorrectos = new ArrayList<>();

		    // 2️⃣ Recorrer TODOS los teléfonos del contacto
		    for (int i = 0; i < telefono.size(); i++) {

		        Telefono errorTelefono = telefono.get(i); // obtenemos cada teléfono

		        // 3️⃣ Si el estado es "E", significa que tiene error
		        if (errorTelefono.getEstado().equals("E")) {

		            // entonces lo agregamos a la lista "incorrectos"
		            incorrectos.add(errorTelefono);
		        }
		    }

		    // 4️⃣ Retornamos la lista con todos los teléfonos incorrectos
		    return incorrectos;
		}


	
	public void imprimir() {
	    System.out.println("Cedula: " + cedula);
	    System.out.println("***"+nombre+" "+apellido+"***");

	    // ⚠ Aquí es donde podía salir NullPointerException si direccion es null
	    if (direccion != null) { // ✅ Verificamos primero si direccion NO es null
	        System.out.println("Direccion: "+ direccion.getCallePrincipal()+" y "+ direccion.getCalleSecundaria());
	    } else {
	        // Si direccion es null, mostramos un mensaje seguro en vez de llamar métodos sobre null
	        System.out.println("No tiene aosciada una direccion");
	    }
	}
	
	
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}


	public ArrayList<Telefono> getTelefono() {
		return telefono;
	}


	public void setTelefono(ArrayList<Telefono> telefono) {
		this.telefono = telefono;
	}
	
	
	
}
