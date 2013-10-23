public class Fatorial {

	public int calcularFatorial(int n) {

		if (n > 1) {
			return n * calcularFatorial(n - 1);
		} else {
			return 1;
		}

	}

}