package clearminds.cuentas;

public class Cuenta {
	private String id;
	private String tipo ="A";
	private double saldo;
	
	
	public Cuenta(String id) {
		this.id=id;
	}
	
	public Cuenta(String id,String tipo, double saldo) {
		this.id=id;
		this.tipo=tipo;
		this.saldo=saldo;
	}
	
	public String getId() {
		return id;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
}	
	
class imprimirConEstilo {
	
	public void imprimir() {
		System.out.println("****************************");
		System.out.println("CUENTA");
		System.out.println("****************************");
	}
	public void imprimirCuenta(String id) {
		System.out.println("Numero de cuenta: "+id);
	}
	public void imprimirTipo(String tipo) {
		System.out.println("Tipo: "+tipo);
	}
	public void imprimirSaldo(double saldo) {
		System.out.println("Saldo: "+saldo);
		System.out.println("****************************");
	}
	
}
