package lesson4;

public class SwitchDemo {
	public static void main(String[] args) {
		switch (args[0]) {
			case "1" :
				System.out.println("Ёто понедельник");
				break;
			case "2" :
				System.out.println("Ёто вторник");
				break;
			case "3" :
				System.out.println("Ёто среда");
				break;
			case "4" :
				System.out.println("Ёто четверг");
				break;
			case "5" :
				System.out.println("Ёто п€тница");
				break;
			case "6" :
			case "7" :
				System.out.println("Ёто выходной");
				break;
			default: 
				System.out.println("¬ы ¬вели неправильное значение");
		}
	}
	

}
