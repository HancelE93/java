package com.cmc.directorio.entidades.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestActivos {

	public static void main(String[] args) {
		Telefono telf= new Telefono("claro","09999987542",20);
		Contacto c1 = new Contacto("Hancel","Espin",telf,1.20);
		AdminContactos  adc= new AdminContactos();
		AdminTelefono at = new AdminTelefono();
		
		adc.activarUsuario(c1);
		at.activarMensajeria(telf);
		c1.imprimir();
		telf.imprimir();
	}

}
