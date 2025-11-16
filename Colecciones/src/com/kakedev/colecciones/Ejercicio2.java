package com.kakedev.colecciones;

import java.util.ArrayList;

public class Ejercicio2 {

	public static void main(String[] args) {
		//se crea el tipo array list de persona 
		ArrayList<Persona>personas;
		
		personas=new ArrayList<Persona>();// instanciar personas 
		
		personas.add(new Persona("Leo","Messi")); 
		//se crea el objeto tipo persona 
		//metoodo add recibe un objeto persona 
		personas.add(new Persona("Crsitiano","Ronaldo"));
		personas.add(new Persona("Thiago","Messi"));
		
		Persona elementoPersona;
		//creamos la variable para capturar lo qye recupero al barrer
		
		for (int i=0;i<personas.size();i++) {
			// for para barrer cada uno de los elementos
			elementoPersona=personas.get(i);
			System.out.println(elementoPersona.getNombre()+"-"+elementoPersona.getApellido());
		}
	}

}