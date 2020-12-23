package Lesson10;

public class PrintableDemo {
	public static void main(String[] args) {
		Book book1 = new Book("AZAZA");
		Book book2 = new Book("AZA");
		Magazine magazine1 = new Magazine("123123");
		Magazine magazine2 = new Magazine("123");
		Printable[] printables = { book1, book2, magazine1, magazine2 };
		for (Printable p : printables) {
			p.print();
		}
	}
}
