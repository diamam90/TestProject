package lesson14;
import java.util.function.Function;
public class FunctionDemo {

	public static void main(String[] args) {
		Function<Integer, String> function1 = number -> {
			String result = "����� ����� ����";
			if (number>0) result= "������������� ��������";
			else if (number<0) result= "������������� �����";
			return result;
		};
		System.out.println(function1.apply(4));
		System.out.println(function1.apply(-3));
		System.out.println(function1.apply(0));
		
	}

}
