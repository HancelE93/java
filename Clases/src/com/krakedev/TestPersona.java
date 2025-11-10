package com.krakedev;
/*
 * 
 * comentario de 
 * varias lineas 
 * 
 */
public class TestPersona {

	public static void main(String[] args) {
		
// solo se ejecuta java con la case que contenga main
		//esto es un comentario 
		
		Persona p; // 1 declaro una variabel llamada p tipo persona 
		p = new Persona();// 2 intancias o crear un objeto persona, se referencia con p
		Persona p2= new Persona();
	
		
		//System.out.println("hola mundo");
		//3 accedo a los atributos  p.
		System.out.println("nombre:"+p.getNombre());//ctlr + barra de espacio y enter
		System.out.println("edad:"+p.getEdad());
		System.out.println("estatura:"+p.getEstatura());
		
		
		//4  Modificar atributos 
		
		p.setNombre("Mario");
		p.setEdad(45);
		p.setEstatura(1.56);
		
		System.out.println("********");
		//5 accedo a los atributos  p.
		System.out.println("nombre:"+p.getNombre());//ctlr + barra de espacio y enter
		System.out.println("edad:"+p.getEdad());
		System.out.println("estatura:"+p.getEstatura());
		
		p2.setNombre("Angelina");
		
		System.out.println("********");
		System.out.println("p.nombre: "+p.getNombre());
		System.out.println("p2.nombre: "+p2.getNombre());
				
	}

}
