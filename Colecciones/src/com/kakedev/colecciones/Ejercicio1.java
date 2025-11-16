package com.kakedev.colecciones;

import java.util.ArrayList;

public class Ejercicio1 {

	public static void main(String[] args) {
		ArrayList<String> cadenas; //tipo de dato
		
		
		//invoco al controcutor vacio de arraylist
		cadenas = new ArrayList<String>(); /// instanciar el arraylist 
		
		System.out.println(cadenas.size());
		
		// tamaño del arreglo .size para q me de cuantos elementos 
		
		
		cadenas.add("uno");// posicion 0
		// se agrega elemento con add
		cadenas.add("dos");// posicion 11
		
		System.out.println(cadenas.size());
		
		String valorRecuperado;
		valorRecuperado=cadenas.get(0); //devuelveme elemento en la posiicion 0
		//devuelve a string y guardamos en valor recuperado
		System.out.println(valorRecuperado);
		
		valorRecuperado=cadenas.get(1);
		System.out.println(valorRecuperado);
		// si pongo un valor q no exite me da null pinter exeption
		
		String cadena;
		
		for(int i=0;i<cadenas.size();i++) {
			cadena=cadenas.get(i); 
			System.out.println("cadena: "+cadena);
		}
	}

}
