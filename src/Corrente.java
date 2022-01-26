
public class Corrente extends Conta {
	
	public Corrente(Cliente cliente) {
		super(cliente);
	}
	
	@Override
	public void imprimirExtrato() {
		System.out.println("====== Conta Corrente ======");
		super.imprimirExtrato();
	}

}
