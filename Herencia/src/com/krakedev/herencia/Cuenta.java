package com.krakedev.herencia;

public class Cuenta {
	String numero_cuenta;
	double saldo;
	
	
	@Override
	public String toString() {
		return "Cuenta [numero_cuenta=" + numero_cuenta + ", saldo=" + saldo + "]";
	}


	public Cuenta(String numero_cuenta, double saldo) {
		super();
		this.numero_cuenta = numero_cuenta;
		this.saldo = saldo;
	}
	
	
	public String getNumero_cuenta() {
		return numero_cuenta;
	}
	public void setNumero_cuenta(String numero_cuenta) {
		this.numero_cuenta = numero_cuenta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
}
