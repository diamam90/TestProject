
public class HomeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		blink(10);
		System.out.println(isFirstLampOn(101));
	}

	public static void blink(int number) {
		int garland = 20;
		for (int i = 0; i < number; i++) {
			System.out.println(Integer.toBinaryString(garland));
			garland = ~garland;
		}
	}

	public static boolean isFirstLampOn(int garland) {
		System.out.println(garland & 1);
		return (garland & 1) == 1;

	}
}
