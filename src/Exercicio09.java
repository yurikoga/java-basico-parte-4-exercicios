public class Exercicio09 {
	static class Celular {
		String marca;
		String modelo;

		Celular(String marca, String modelo) {
			this.marca = marca;
			this.modelo = modelo;
		}
	}

	public static void main(String[] args) {
		Celular celular = new Celular("Xiaomi", "Redmi Note 13");
		System.out.println("Celular: " + celular.marca + " " + celular.modelo);
	}
}