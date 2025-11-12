package com.krakedev.composicion.test;

import com.krakedev.composicion.Direccion;
import com.krakedev.composicion.Persona;

public class TestPersona {

	public static void main(String[] args) {
		Persona p1= new Persona();
		p1.setNombre("Hancel");
		p1.setApellido("Espin");
		
		Direccion dir = new Direccion();//instanciar
		dir.setCallePrincipal("av Siempre viva");//setear valores
		dir.setCalleSecundaria("la que cruza");
		dir.setNumero("N48");
		
		p1.setDireccion(dir);
		
		String nombre = p1.getNombre();
		Direccion d1 = p1.getDireccion();
		
		System.out.println(nombre);
		System.out.println(d1.getCallePrincipal());
		
		//null.algun metodo para que de un error exception
		//direccion esta null para q aparezca error  
		//trato de invocar  a un metodo con esa variable
	
		p1.imprimir();
		
		Persona p2 =new Persona();
		Direccion d2= new Direccion("Av Shiris","Av Eloy Alfaro","S/N");
		p2.setNombre("Anastasia");
		p2.setDireccion(d2);
		p2.imprimir();
		
		Persona p3 =new Persona();
		p3.setDireccion(new Direccion("xx","yy","123"));
		p3.imprimir();
 }
}