package lesson14;
import java.util.function.Function;
public class FunctionDemo {

	public static void main(String[] args) {
		Function<Integer, String> function1 = number -> {
			String result = "Число равно нулю";
			if (number>0) result= "Положительное значение";
			else if (number<0) result= "Отрицательное число";
			return result;
		};
		System.out.println(function1.apply(4));
		System.out.println(function1.apply(-3));
		System.out.println(function1.apply(0));
		
	}

}
