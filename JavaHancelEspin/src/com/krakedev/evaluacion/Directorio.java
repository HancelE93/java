package com.krakedev.evaluacion;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Directorio {
	public ArrayList<Contacto> contactos;
	private Date ultimaModificacion;
	public ArrayList<Contacto> correctos;
	public ArrayList<Contacto> incorrectos;

	public void depurar () {
		for (int i=0; i < contactos.size(); i++) {
			Contacto c= contactos.get(i);
			
			if(c.getDireccion() != null) {
				correctos.add(c);
			}else {
				incorrectos.add(c);
			}
		}
		
		contactos.clear();
	}
	
	public int contarFijos() {
	    int contador = 0; // inicializamos el contador

	    for (int i = 0; i < contactos.size(); i++) {
	        Contacto conteo = contactos.get(i);  // obtenemos cada contacto de la lista
	        
	        for (int j=0; j < conteo.getTelefono().size(); j++) {
	            Telefono telf = conteo.getTelefono().get(j); // obtenemos cada teléfono del contacto
	            
	            if (telf.getTipo().equals("Convencional") && telf.getEstado().equals("C")) {
	                contador++; // si el teléfono es Convencional y está en estado "C", aumentamos el contador
	            }
	        }
	    }

	    return contador; // retornamos la cantidad total de teléfonos que cumplen la condición
	}

	public int contarPerdidos() {

		int contador = 0; // inicializamos el contador

		for (int i = 0; i < contactos.size(); i++) {
			Contacto conteo = contactos.get(i);
			// Si el contacto NO tiene dirección asignada
			if (conteo.getDireccion() == null) {
				contador++; // incrementamos el contador
			}
		}

		return contador; // retornamos la cantidad de contactos sin dirección
	}

	// Consultar la última modificación en formato "yyyy/MM/dd HH:mm:ss"
	public String consultarUltimaModificacion() {
		if (ultimaModificacion == null) {
			return "No se ha modificado ningún contacto aún.";
		}
		SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		return formato.format(ultimaModificacion);
	}

	/*
	 * public boolean agregarContacto(Contacto contactoNuevo) {
	 * 
	 * // 1️⃣ Recorrer toda la lista de contactos for (int i = 0; i <
	 * contactos.size(); i++) {
	 * 
	 * Contacto existente = contactos.get(i); // contacto actual de la lista
	 * 
	 * // 2️⃣ Verificar si la cédula ya existe if
	 * (existente.getCedula().equals(contactoNuevo.getCedula())) {
	 * 
	 * // ❌ Ya existe un contacto con esa cédula → No se agrega return false; } }
	 * 
	 * // 3️⃣ Si NO se encontró → agregarlo a la lista contactos.add(contactoNuevo);
	 * 
	 * // ✔ Contacto agregado correctamente return true; }
	 */

	// Método para agregar un contacto
	public boolean agregarContacto(Contacto contactoNuevo) {
		// Reusar el método buscarPorCedula
		if (buscarPorCedula(contactoNuevo.getCedula()) != null) {
			// Ya existe un contacto con esa cédula → No se agrega
			return false;
		}
		// No existe → agregar
		contactos.add(contactoNuevo);

		// Actualizar fecha de última modificación
		ultimaModificacion = new Date();

		// Cada vez que agregas un contacto, quieres registrar la fecha y hora exacta en
		// que se modificó el directorio.

		return true;
	}

	public Contacto buscarPorCedula(String Cedula) {
		for (int i = 0; i < contactos.size(); i++) {
			Contacto existe = contactos.get(i);

			if (existe.getCedula().equals(Cedula)) {
				return existe;
			}
		}
		return null;
	}

	public Directorio() {
		contactos = new ArrayList<Contacto>(); // siempre inicializar el ArrayList no olvidarse...
		correctos=new ArrayList<Contacto>();
		incorrectos=new ArrayList<Contacto>();
	}

	public ArrayList<Contacto> getContactos() {
		return contactos;
	}

	public void setContactos(ArrayList<Contacto> contactos) {
		this.contactos = contactos;
	}

	public ArrayList<Contacto> getCorrectos() {
		return correctos;
	}

	public void setCorrectos(ArrayList<Contacto> correctos) {
		this.correctos = correctos;
	}

	public ArrayList<Contacto> getIncorrectos() {
		return incorrectos;
	}

	public void setIncorrectos(ArrayList<Contacto> incorrectos) {
		this.incorrectos = incorrectos;
	}
	
	
	
}
