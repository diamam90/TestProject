import java.util.Scanner;
public class HomeworkInput {

	public static void main(String[] args) {
		int firstNum = 0;
		int secondNum = 0;
		int intSum =0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first integer number");
		firstNum = returnInteger(input);
		System.out.println("Enter second integer number");
		secondNum = returnInteger(input);
		intSum=firstNum+secondNum;
		System.out.println("Sum of first and second number:" + intSum);
	}



	static int returnInteger(Scanner sc) {
		int retInt;
		if (sc.hasNextInt()) {
			retInt=sc.nextInt();
			sc.nextLine();
			return retInt;
			}
		else {
			System.out.println("Error has occured, please put correct integer number");
			sc.nextLine();
			retInt=returnInteger(sc);
			return retInt;
		}
	
		//return retInt = sc.nextInt();
		
		}
}