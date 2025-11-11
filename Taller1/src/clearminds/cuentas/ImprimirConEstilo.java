package clearminds.cuentas;

public class ImprimirConEstilo {
	public void imprimir() {
        System.out.println("****************************");
        System.out.println("CUENTA");
        System.out.println("****************************");
    }

    public void imprimirCuenta(String id) {
        System.out.println("Número de cuenta: " + id);
    }

    public void imprimirTipo(String tipo) {
        System.out.println("Tipo: " + tipo);
    }

    public void imprimirSaldo(double saldo) {
        System.out.println("Saldo: " + saldo);
    }
}
