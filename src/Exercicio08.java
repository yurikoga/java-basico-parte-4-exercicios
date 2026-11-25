public class Exercicio08 {
	static class Curso {
		String nome;
		int cargaHoraria;

		Curso(String nomeCurso, int horas) {
			nome = nomeCurso;
			cargaHoraria = horas;
		}
	}

	public static void main(String[] args) {
		Curso curso = new Curso("Análise e Desenvolvimento de Sistemas", 2000);
		System.out.println("Curso: " + curso.nome + " | Carga horária: " + curso.cargaHoraria + "h");
	}
}