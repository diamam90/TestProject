package Lesson7;
import java.util.Arrays;
public class Reader {
	String fullName;
	int numberOfTicket;
	String faculty;
	String birthDate;
	String phone;
	
	Reader(String fullName,int numberOfTicket,String faculty,String birthDate,String phone){
		this(fullName,numberOfTicket);
		this.faculty=faculty;
		this.birthDate=birthDate;
		this.phone=phone;
		}
	Reader(String fullName,int numberOfTicket){
		this.fullName=fullName;
		this.numberOfTicket=numberOfTicket;
	}
	Reader() {
		
	}
	void takeBook(int books) {
		System.out.println(fullName + " взял " + books + " книги");
	}
	void takeBook(String...books) {
		System.out.println(fullName + " взял книги:" + Arrays.toString(books));
	}
	void takeBook(Book... kniga) {
		System.out.println(fullName+" взял " +kniga.length+ " книги:");
		for (Book element: kniga) {
			System.out.println(element.nameAuthor+" \t"+ element.bookTitle);
		}
		;
	}
}
