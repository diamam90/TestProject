package lesson4;

public class IfElseIfDemo {

	public static void main(String[] args) {
		if ("1".equals(args[0])) {
			System.out.println("Это понедельник");
		} else if ("2".equals(args[0])) {
			System.out.println("Это вторник");
		} else if ("3".equals(args[0])) {
			System.out.println("Это среда");
		} else if ("4".equals(args[0])) {
			System.out.println("Это четверг");
		} else if ("5".equals(args[0])) {
			System.out.println("Это пятница");
		} else if ("6".equals(args[0]) || "7".equals(args[0])) {
			System.out.println("Это выходной");
		} else
			System.out.println("Ввели неправильное значение");
	}

}
