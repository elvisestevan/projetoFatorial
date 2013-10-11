public class Fatorial {

	public static void main(String[] args) {

		System.out.println(calcularFatorial(5));		

	}

	public static int calcularFatorial(int n) {

		if (n > 1) {
			return n * calcularFatorial(n - 1);
		} else {
			return 1;
		}

	}

}