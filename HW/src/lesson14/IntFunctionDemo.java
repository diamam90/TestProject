package lesson14;
import java.util.function.IntFunction;
import java.util.function.Supplier;
public class IntFunctionDemo {

	public static void main(String[] args) {
		
		IntFunction<String> function = String::valueOf;
		System.out.println(function.apply(450));
		
		Supplier<String> supp1 = String::new;
		System.out.println(supp1.get());
	}

}
