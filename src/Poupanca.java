
public class Poupanca extends Conta {
	public Poupanca(Cliente cliente) {
		super(cliente);
	}
	
	@Override
	public void imprimirExtrato() {
		System.out.println("====== Conta Poupan�a ======");
		super.imprimirExtrato();
	}
}
