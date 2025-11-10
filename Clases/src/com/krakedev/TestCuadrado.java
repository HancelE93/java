package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {
		Cuadrado c1=new Cuadrado();
		Cuadrado p1=new Cuadrado();
		
		Cuadrado c2= new Cuadrado(5);
		
		double areaC1;
		double perimetroC;
		double areaC2;

		
		
		c1.setLado(4);
		areaC1 =c1.getArea();
		
		p1.setLado(3);;
		perimetroC =p1.getPerimetro();
		
		areaC2=c2.getArea();
		
		System.out.println("El area del cuadrado 1 es:" + areaC1);
		System.out.println("El perimetro del cuadrado es:" + perimetroC);
		
		System.out.println("El area del cuadrado 2 es:" + areaC2);
		
	}

}
