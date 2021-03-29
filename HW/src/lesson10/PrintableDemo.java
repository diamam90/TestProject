package Lesson10;
class Print1 implements Printable {
	public void print() {System.out.println("It's print1's object!!!");}
	static void staticMethod() {System.out.println("Using static method for Print1");}
}
public class PrintableDemo {
	public static void main(String[] args) {
		Book book1 = new Book("AZAZA");
		Book book2 = new Book("AZA");
		Magazine magazine1 = new Magazine("123123");
		Magazine magazine2 = new Magazine("123");
		
		Printable newspaper = ()-> System.out.println("Print newspaper");
		
		
		Printable[] printables = { book1, book2, magazine1, magazine2, newspaper,
				new Printable() {public void print() {System.out.println("It's new print");}; 
		}};
		for (Printable p : printables) {
			p.print();
		}
		Printable pr1 = Print1::staticMethod;
	}
}
