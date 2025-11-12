package com.cmc.directorio.entidades.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono3 {

	public static void main(String[] args) {
		Telefono telf1 = new Telefono("movi","0923458576",15);
		Telefono telf2 = new Telefono("claro","0923458586",55);
		Telefono telf3 = new Telefono("movi","0923458577",10);
		
		AdminTelefono at =new AdminTelefono();
		;
		int cantidad=at.contarMovi(telf1, telf2, telf3);
		
		System.out.println("La cantidad de telefono con operador movi es; "+cantidad);
	
	}

}
