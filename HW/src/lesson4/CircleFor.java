package lesson4;

//import java.util.*;
public class CircleFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (String str : args) {
			System.out.println("Значение:" + str);
			int y = 0;
			y = Integer.parseInt(str);
			sum += y;
		}
		System.out.println("Сумма этих чисел=" + sum);
	}

}
