package Lesson7;

public class ReaderDemo {

	public static void main(String[] args) {
		Reader read1=new Reader("Petrov A.A.", 2993, "FAI", "08/09/1990", "8952345");
		Reader read2=new Reader("Ivanov I.I.", 1293, "GAI", "18/09/1943", "1152345");
		Reader read3=new Reader("Salam Aleykum A.A", 1293);
		Reader read4=new Reader();
		read4.fullName="Олег Иваныч";
		read4.faculty="MPEI";
		read4.phone="5353535";
		
		read4.takeBook(4);
		read3.takeBook("Приключения шурика","Принцесса на горошине","Сказки");
		
		Book book1=new Book("А.С. Пушкин", "Евгений Онегин");
		Book book2=new Book("Н.В. Гоголь", "Нос");
		Book book3=new Book("А. Дюма", "Три мушкетера");
		System.out.println();
		read2.takeBook(new Book ("Конан Дойл", "Шерлок Холмс"));
		
		System.out.println();
		read2.takeBook(book3,book1);
	}
																																																																																																																																																																																																																																																																																																		
}
