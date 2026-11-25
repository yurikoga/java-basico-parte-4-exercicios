public class Exercicio02 {
	static class Produto {
		String nome;
		double preco;
	}

	public static void main(String[] args) {
		Produto p1 = new Produto();
		p1.nome = "Mouse";
		p1.preco = 89.90;

		Produto p2 = new Produto();
		p2.nome = "Monitor";
		p2.preco = 950.00;

		Produto p3 = new Produto();
		p3.nome = "Teclado";
		p3.preco = 180.00;

		Produto maisCaro = p1;
		if (p2.preco > maisCaro.preco) {
			maisCaro = p2;
		}
		if (p3.preco > maisCaro.preco) {
			maisCaro = p3;
		}

		System.out.println("Produto mais caro: " + maisCaro.nome + " (R$ " + maisCaro.preco + ")");
	}
}