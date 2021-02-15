package lesson14;
import java.util.Random;
import java.util.function.Supplier;
public class SupplierDemo {

	public static void main(String[] args) {
		Random rand = new Random();
		Supplier<Integer> supp1 = ()-> rand.nextInt(10);   
		System.out.println(supp1.get());
	}

}
