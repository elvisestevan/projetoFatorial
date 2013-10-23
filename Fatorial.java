public class Fatorial {
	//Versao recursiva do calculo do fatorial
	public int calcularFatorial(int n) {

		if (n > 1) {
			return n * calcularFatorial(n - 1);
		} else {
			return 1;
		}

	}

}