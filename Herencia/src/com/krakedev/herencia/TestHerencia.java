package com.krakedev.herencia;

public class TestHerencia {

	public static void main(String[] args) {
		Perro p= new Perro();
		p.dormir();
		//herencia es decir saca de la class Animal el metodo formir
		//*Animal a=new Animal();
		//Animal hereda de object cuando no le ponemos herencia extends
		//*System.out.println(a.hashCode());//
		//*p.ladrar();// perro ya no hereda de objetc si no de Animal.
		
		Gato g = new Gato();
		g.dormir();
	}

}
