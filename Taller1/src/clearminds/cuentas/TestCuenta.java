package clearminds.cuentas;

public class TestCuenta {

	public static void main(String[] args) {
		
		Cuenta cuenta1= new Cuenta("03476");
		cuenta1.setSaldo(675);
		
		Cuenta cuenta2= new Cuenta("03476","C",98);
		
		Cuenta cuenta3= new Cuenta("03476");
		cuenta3.setTipo("C");
		
		
		System.out.println("--------Valores Iniciales--------");
		System.out.println("Cuenta 1:"+cuenta1.getId());
		System.out.println("Cuenta 1:"+cuenta1.getTipo());
		System.out.println("Cuenta 1 :"+cuenta1.getSaldo());
		System.out.println("********");
		
		System.out.println("--------Valores Iniciales--------");
		System.out.println("Cuenta 2:"+cuenta2.getId());
		System.out.println("Cuenta 2:"+cuenta2.getTipo());
		System.out.println("Cuenta 2 :"+cuenta2.getSaldo());
		System.out.println("********");
		
		System.out.println("--------Valores Iniciales--------");
		System.out.println("Cuenta 3:"+cuenta3.getId());
		System.out.println("Cuenta 3:"+cuenta3.getTipo());
		System.out.println("Cuenta 3 :"+cuenta3.getSaldo());
		System.out.println("********");
		
		
		cuenta1.setSaldo(444);
		cuenta2.setTipo("D");
		cuenta3.setSaldo(567);
		
		System.out.println("--------Valores Iniciales--------");
		System.out.println("Cuenta 1:"+cuenta1.getId());
		System.out.println("Cuenta 1:"+cuenta1.getTipo());
		System.out.println("Cuenta 1 :"+cuenta1.getSaldo());
		System.out.println("********");
		
		System.out.println("--------Valores Iniciales--------");
		System.out.println("Cuenta 2:"+cuenta2.getId());
		System.out.println("Cuenta 2:"+cuenta2.getTipo());
		System.out.println("Cuenta 2 :"+cuenta2.getSaldo());
		System.out.println("********");
		
		System.out.println("--------Valores Iniciales--------");
		System.out.println("Cuenta 3:"+cuenta3.getId());
		System.out.println("Cuenta 3:"+cuenta3.getTipo());
		System.out.println("Cuenta 3 :"+cuenta3.getSaldo());
		System.out.println("********");
		
		Cuenta cuenta4= new Cuenta("0987");
		cuenta4.setTipo("A");
		cuenta4.setSaldo(10);
		
		
		imprimirConEstilo impresor = new imprimirConEstilo();
		
		impresor.imprimir();
		impresor.imprimirCuenta(cuenta4.getId());
		impresor.imprimirTipo(cuenta4.getTipo());
		impresor.imprimirSaldo(cuenta4.getSaldo());
		
		Cuenta cuenta5 = new Cuenta("0557","C",10);
		
		impresor.imprimir();
		impresor.imprimirCuenta(cuenta5.getId());
		impresor.imprimirTipo(cuenta5.getTipo());
		impresor.imprimirSaldo(cuenta5.getSaldo());
		
		
		Cuenta cuenta6 = new Cuenta("0666","A",0);
		
		impresor.imprimir();
		impresor.imprimirCuenta(cuenta6.getId());
		impresor.imprimirTipo(cuenta6.getTipo());
		impresor.imprimirSaldo(cuenta6.getSaldo());
		
		
		
		
	}

}
