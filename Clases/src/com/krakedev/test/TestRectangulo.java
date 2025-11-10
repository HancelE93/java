package com.krakedev.test;

import com.krakedev.Rectangulo;

public class TestRectangulo {

	public static void main(String[] args) {
		Rectangulo r1=new Rectangulo();
		Rectangulo r2=new Rectangulo();
		Rectangulo p=new Rectangulo();
		
		int areaR1;
		int areaR2;
		double perimetroR;
		
		r1.setBase(10);
		r1.setAltura(5);
		
		
		r2.setBase(8);
		r2.setAltura(3);
		
		
		p.setBase(4);
		p.setAltura(2);
		
		areaR1 =r1.getArea();
		areaR2 =r2.getArea();
		
		perimetroR =p.getPerimetro();
		
		System.out.println("El area del Rectangul es: "+areaR1);
		System.out.println("El area del Rectangul es: "+areaR2);
		System.out.println("El perimetro del Rectangul es: "+perimetroR);;
	}

}
