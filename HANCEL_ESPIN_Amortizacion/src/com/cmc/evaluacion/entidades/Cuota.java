package com.cmc.evaluacion.entidades;

public class Cuota {
	public int Numero;
	public double cuota;
	public double capital;
	public double Inicio;
	public double interes;
	public double abonoCapital;
	public double saldo;
	
	
	
	public Cuota(int numero) {
		Numero = numero;
	}
	
	public void mostrarPrestamo() {
		System.out.println(Numero+" | "+Utilitario.redondear(cuota)+" | "+Utilitario.redondear(Inicio)+" | "+Utilitario.redondear(interes)+" | " +Utilitario.redondear(abonoCapital)+" | "+Utilitario.redondear(saldo));
	}
	
	public double getCuota() {
		return cuota;
	}
	public void setCuota(double cuota) {
		this.cuota = cuota;
	}
	public double getCapital() {
		return capital;
	}
	public void setCapital(double capital) {
		this.capital = capital;
	}
	public double getInicio() {
		return Inicio;
	}
	public void setInicio(double inicio) {
		Inicio = inicio;
	}
	public double getInteres() {
		return interes;
	}
	public void setInteres(double interes) {
		this.interes = interes;
	}
	public double getAbonoCapital() {
		return abonoCapital;
	}
	public void setAbonoCapital(double abonoCapital) {
		this.abonoCapital = abonoCapital;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}



}
