package com.cmc.directorio.entidades.test;

import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContacto1 {

	public static void main(String[] args) {
		Telefono telef = new Telefono("movi","0999878456",10);
		Contacto c = new Contacto("Hancel","Espin",telef,1.2);
		
		c.imprimir();
		telef.imprimir();

	}

}
