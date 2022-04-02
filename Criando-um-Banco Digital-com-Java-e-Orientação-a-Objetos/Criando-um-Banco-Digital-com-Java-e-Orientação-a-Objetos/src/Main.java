
public class Main {

		public static void main(String[] args) {
		Cliente carol = new Cliente();
		carol.setNome("carol");
		Conta cc = new ContaCorrente(carol);
		cc.depositar(100);
		Conta poupanca = new ContaPoupanca(carol);
		cc.transferir(50, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}
}