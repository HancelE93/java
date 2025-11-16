package com.kakedev.colecciones;

import java.util.ArrayList;

public class AdminPersonas {
	//defino un atributo tipo persona 
	private ArrayList<Persona> personas;

	public AdminPersonas() {
		//se crea el contructos para intanciar el onjeto array list
		// para que no este en null con el constructor
		personas = new ArrayList<Persona>();
	}

	public void agregar(Persona persona) {
		//recibe como parameto una persona y la agrega a arraylist
		personas.add(persona);
	}

	public void imprimir() {
		Persona elementoPersona;
		for (int i = 0; i < personas.size(); i++) {
			elementoPersona = personas.get(i);
//cada vez q ictere y me retorna me referencia con la variale elemento persona 
			System.out.println("Persona:" + elementoPersona.getNombre() + " " + elementoPersona.getEdad());
		}
	}

	public Persona buscarPorNombre(String nombre) {
		Persona elementoPersona= null;
		Persona personaEncontrada=null;

		for (int i = 0; i < personas.size(); i++) {
			elementoPersona=personas.get(i);
			if(nombre.equals(elementoPersona.getNombre())) {
		//equal ayuda a comparar el igual igual no es para String
				personaEncontrada=elementoPersona;
			}
		}

		return personaEncontrada;

	}
	
	public ArrayList<Persona>buscarMayores(int edad) {
		ArrayList<Persona> mayores = new ArrayList<Persona>();
		Persona elementolPersona=null;
		for(int i=0;i < personas.size();i++) {
			elementolPersona=personas.get(i);
			if (elementolPersona.getEdad()>edad) {
				mayores.add(elementolPersona);
				
			}
	}
		return mayores;
	}
		
}
