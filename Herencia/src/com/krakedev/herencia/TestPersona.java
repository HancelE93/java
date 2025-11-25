package com.krakedev.herencia;

public class TestPersona {

	public static void main(String[] args) {
		Persona p = new Persona("1723439319","Hancel");
		System.out.println(p.toString());
		
		System.out.println("HOla");
		System.out.println(p);// p.tostring internamente 
		//es decir que se trasforma automaticamente en strigg
		//es una llamada a p.string/
		// p.tostring se ejecuta automaticamente
		
		Cuenta c= new Cuenta("12345",25.5);
		System.out.println(c);
	}
	

}
