
public class Main {

	public static void main(String[] args) {
		
		Cliente daniel = new Cliente("Daniel");
		
		Corrente cc = new Corrente(daniel);
		Poupanca cp = new Poupanca(daniel);
		
		
		cc.depositar(1000);
		cc.transferir(100, cp);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
		
		cc.sacar(1000);

	}

}
