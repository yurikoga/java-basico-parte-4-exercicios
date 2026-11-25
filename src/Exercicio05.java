public class Exercicio05 {
	static class Lampada {
		boolean ligada;

		void ligar() {
			ligada = true;
		}

		void desligar() {
			ligada = false;
		}
	}

	public static void main(String[] args) {
		Lampada lampada = new Lampada();
		lampada.ligar();
		System.out.println("Lâmpada ligada? " + lampada.ligada);

		lampada.desligar();
		System.out.println("Lâmpada ligada? " + lampada.ligada);
	}
}