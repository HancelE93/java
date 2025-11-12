package com.cmc.directorio.entidades.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContactos2 {

	public static void main(String[] args) {
			Telefono telf1 = new Telefono("movi","0999875421",19);
			Telefono telf2 = new Telefono("claro","09878945612",18);
			Contacto c1 = new Contacto("Daniel","Espin",telf1,0.95);
			Contacto c2 = new Contacto("Pepe","luna",telf2,1.6);
			
			AdminContactos adc = new AdminContactos();
			 
			Contacto maspesado=adc.buscarMasPesado(c1, c2);
			boolean comparar=adc.compararOperadores(telf1, telf2);
			
			System.out.println("el celular mas pesado es: "+ maspesado.getNombre());
			System.out.println("Son de la misma operadora: "+comparar);
		}
		

	}