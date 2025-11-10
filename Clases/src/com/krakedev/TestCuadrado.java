package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {
		Cuadrado c1=new Cuadrado();
		Cuadrado p1=new Cuadrado();
		double areaC1;
		double perimetroC;
		
		
		c1.setLado(4);
		areaC1 =c1.getArea();
		
		p1.setLado(3);;
		perimetroC =p1.getPerimetro();
		
		System.out.println("El area del cuadrado es:" + areaC1);
		System.out.println("El perimetro del cuadrado es:" + perimetroC);
		
	}

}
