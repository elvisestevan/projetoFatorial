public class Fatorial {
	//Versao recursiva do calculo do fatorial
	public int calcularFatorial(int n) throws IllegalArgumentException{

		if (n < 0)
			throw new IllegalArgumentException("Não existe fatorial para números negativos");

		if (n > 1) {
			return n * calcularFatorial(n - 1);
		} else {
			return 1;
		}

	}

}