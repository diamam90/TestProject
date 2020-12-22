import java.util.Scanner;

public class demoReturnInteger {
	
	
	public static void main(String[] args) {
		int num1=0;
		int num2=0;
		int sumOfN1N2=0;
		System.out.println("Input integer number 1:");
		Scanner inputNumber = new Scanner(System.in);
		num1=returnInteger(inputNumber);
		System.out.println("Input integer number 2:");
		num2=returnInteger(inputNumber);
		sumOfN1N2=num1+num2;
		System.out.println("Sum:\t" + sumOfN1N2);
		
	}

	static int returnInteger(Scanner sc) {
		int retInt;
		if (sc.hasNextInt()) {
			retInt=sc.nextInt();
			sc.nextLine();
			System.out.println(retInt);
			return retInt;
		}
		else {
			System.out.println("input correct integer number!");
			sc.nextLine();
			retInt=returnInteger(sc);
			return retInt;
		}
	
	}

}
