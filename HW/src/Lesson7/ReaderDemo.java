package Lesson7;

public class ReaderDemo {

	public static void main(String[] args) {
		Reader read1=new Reader("Petrov A.A.", 2993, "FAI", "08/09/1990", "8952345");
		Reader read2=new Reader("Ivanov I.I.", 1293, "GAI", "18/09/1943", "1152345");
		Reader read3=new Reader("Salam Aleykum A.A", 1293);
		Reader read4=new Reader();
		read4.fullName="���� ������";
		read4.faculty="MPEI";
		read4.phone="5353535";
		
		read4.takeBook(4);
		read3.takeBook("����������� ������","��������� �� ��������","������");
		
		Book book1=new Book("�.�. ������", "������� ������");
		Book book2=new Book("�.�. ������", "���");
		Book book3=new Book("�. ����", "��� ���������");
		System.out.println();
		read2.takeBook(new Book ("����� ����", "������ �����"));
		
		System.out.println();
		read2.takeBook(book3,book1);
	}
																																																																																																																																																																																																																																																																																																		
}
