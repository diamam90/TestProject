import java.io.*;
import java.util.Scanner;
public class TestTest {

	public static void main(String[] args) {
		boolean qwe = true;
		int i=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("¬ведите число");
		while ((qwe)) {
			if (scan.hasNextInt()) {
				System.out.println("1111111");
				i=scan.nextInt();
				
				qwe=false;
			}
		scan.nextLine();	 
		}
		System.out.println("число "+ i);
		System.out.println("END");
	}
}
