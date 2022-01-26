
public class Conta implements IConta {
	private static final String AGENCIA = "00001";
	private static int NUMERO = 1;
	
	private double saldo;
	private int numero;
	private String agencia;
	private Cliente cliente;
	
	public Conta( Cliente cliente) {
		this.numero = NUMERO++;
		this.agencia = AGENCIA;
		this.cliente = cliente;
	}
	
	@Override
	public void sacar(double valor) {
		if(this.saldo > valor) {
			this.saldo -= valor;
		} else {
			System.out.println("Saldo insuficiente");
		}
		
	}
	
	@Override
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	@Override
	public void transferir(double valor, IConta destino) {
		this.sacar(valor);
		destino.depositar(valor);
	}
	
	@Override
	public void imprimirExtrato() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %s", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
		System.out.println("\n");
	}


	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public String getAgencia() {
		return this.agencia;
	}
	
	
	
	
	
	

}
