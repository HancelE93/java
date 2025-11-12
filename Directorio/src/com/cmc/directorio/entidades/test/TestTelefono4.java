package com.cmc.directorio.entidades.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono4 {

	public static void main(String[] args) {
		Telefono telf1 = new Telefono("claro","0927458576",12);
		Telefono telf2 = new Telefono("claro","0943458586",25);
		Telefono telf3 = new Telefono("movi","0926458577",18);
		Telefono telf4 = new Telefono("claro","088458577",19);
		AdminTelefono at =new AdminTelefono();
		;
		at.contarClaro(telf1, telf2, telf3,telf4);
		
		System.out.println("La cantidad de telefono con operaddor claro es: "+at.contarClaro(telf1, telf2, telf3,telf4));
		
	
	}

	}
