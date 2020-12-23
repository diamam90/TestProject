class StaticX {
	static int i = 6;

}

public class Ex8 {

	public static void main(String[] args) {
		StaticX tt1 = new StaticX();
		StaticX tt2 = new StaticX();
		StaticX tt3 = new StaticX();
		System.out.println(tt1.i);
		System.out.println(tt2.i);
		System.out.println(tt3.i);

	}

}
