package com.persistencia.test;

import java.util.Date;

import com.krakedev.persistencia.entidades.EstadoCivil;
import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;
import com.krakedev.persistencia.utils.Convertidor;


//System.out.println solo se va poder usar en los tests

public class TestAdminPersona {

	public static void main(String[] args) {
		EstadoCivil ec = new EstadoCivil("U", "Union LIbre");
		Persona p= new Persona("1723888899","ushull","Sepin",ec);
		
		try {
			Date fechaNac = Convertidor.convertirFecha("1993/12/23");
			Date horaNac = Convertidor.convertirHora("12:30:00");
			p.setFecha_nacimiento(fechaNac);
			p.setHora_nacimiento(horaNac);
			AdminPersonas.insertar(p);
			
			System.out.println("Persona agregada");
			
		} catch (Exception e) {
			
			System.out.println("Error en el sistema: "+e.getMessage());
		}
		
		
		


	}

}
