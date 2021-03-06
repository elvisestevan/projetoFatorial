//Testando branche experimentos
public class Fatorial {
	//Versao recursiva do calculo do fatorial, incluindo o teste para n < 0
	public int calcularFatorial(int n) throws IllegalArgumentException{

		if (n < 0)
			throw new IllegalArgumentException("N�o existe fatorial para n�meros negativos");

		if (n > 1) {
			return n * calcularFatorial(n - 1);
		} else {
			return 1;
		}

	}

}