package Lesson9;

public class ShopDemo {

	public static void main(String[] args) {
		
		Product product1=new Product("����� � �������" ,23.4, 4.5);
		Product product2=new Product("����������" ,20.4, 4.8);
		Product product3=new Product("�������������" ,30, 4.4);
		Product product4=new Product("���� �����" ,100, 4.0);
		Product product5=new Product("������������� ��������" ,70, 4.3);
		Product product6=new Product("������� �������" ,40, 2.0);
		Product product7=new Product("������� ���������" ,20, 1.0);
		Product product8=new Product("�����" ,10, 4.0);
		Product product9=new Product("Barilla" ,20, 4.4);
		Product product10=new Product("�����������" ,8, 3.9);
	
		Category category1=new Category("��������", product8,product9,product10);
		Category category2=new Category("�������",product4,product6,product7, product5);
		Category category3=new Category("������",product1,product2,product3);
		
		Basket basket1=new Basket(product1,product2,product3,product10);
		
		User user1=new User("admin","mpei34525", basket1);
		category1.printCategory();
		basket1.printBasket();
		System.out.println();
		category2.printCategory();
		System.out.println(product1.getCategory());
		
	}

}
