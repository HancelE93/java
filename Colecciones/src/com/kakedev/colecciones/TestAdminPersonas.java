package com.kakedev.colecciones;

import java.util.ArrayList;

public class TestAdminPersonas {

	public static void main(String[] args) {
		//intancio
		AdminPersonas admin=new AdminPersonas(); 
		// con la referecia admin voy a llamar el metodo agregar  recibe una persona 
		admin.agregar(new Persona("Mario","Bennedetti",50));
		admin.agregar(new Persona("Majo","Rocaurte",18));
		admin.agregar(new Persona("Clark","Kent",35));
		admin.imprimir();

		Persona p1=admin.buscarPorNombre("Majo");
		if(p1!=null) {
			System.out.println("ENCONTRADO: "+p1.getApellido()+" "+p1.getEdad());
		}else {
			System.out.println("No existe la persona con ese nombre");
		}
		
		ArrayList<Persona> personaMayores=admin.buscarMayores(25);
		System.out.println("Mayores: "+personaMayores.size());
		
	}

}
