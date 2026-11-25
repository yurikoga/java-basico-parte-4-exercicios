public class Exercicio04 {
	static class Conta {
		double saldo;

		void depositar(double valor) {
			saldo += valor;
		}
	}

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.saldo = 100.0;
		conta.depositar(250.0);

		System.out.println("Saldo atual: R$ " + conta.saldo);
	}
}