public class Exercicio07 {
	static class Livro {
		String titulo;
		boolean disponivel = true;

		void emprestar() {
			disponivel = false;
		}

		void devolver() {
			disponivel = true;
		}
	}

	public static void main(String[] args) {
		Livro livro = new Livro();
		livro.titulo = "Clean Code";

		System.out.println(livro.titulo + " disponível? " + livro.disponivel);
		livro.emprestar();
		System.out.println("Após empréstimo, disponível? " + livro.disponivel);
		livro.devolver();
		System.out.println("Após devolução, disponível? " + livro.disponivel);
	}
}