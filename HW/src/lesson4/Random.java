package lesson4;

public class Random {
	public static void main(String[] args) {
		long Fact = 1;
		int n = (int) (Math.random() * 20);
		for (int i = 1; i < n; i++) {
			Fact *= i;
		}
		System.out.println("факториал " + n + " равен:\t" + Fact);

	}
}
