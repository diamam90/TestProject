package lesson12;

import java.util.Scanner;

class User {
	User(String login, String password) {
		this.login = login;
		this.password = password;
	}

	private String login;
	private String password;
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public void setPassword(String pass) {
		password = pass;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getLogin() {
		return login;
	}

	public String getPassword() {
		return password;
	}

	public String getName() {
		return name;
	}

}

class Category {
	private static int count;
	private int id;
	private int productNum[];
	Products[] product;
	private String name;

	Category(String name, Products... product) {
		id = ++count;
		this.name = name;
		this.product = product;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Products getProduct(int num) {
		return product[num];
	}

	public void setProduct(Products[] product) {
		this.product = product;
	}
	public  Products[] getAllProducts() {
		return product;
	}
	
}

class Cart {
	private int count = 0;
	Products[] product = new Products[20];
	private int[] numProduct = new int[20];
	private double totalCost = 0;

	public double setTotalCost(Products product, int count) {
		return totalCost += product.getPrice() * count;
	}

	public void addProduct(Products p, int num) {
		product[count] = p;
		numProduct[count] = num;
		setTotalCost(product[count], numProduct[count]);
		System.out.println("������� " + product[count].getName() + " , ����� " + product[count].getPrice()
				+ " ���., � ���������� " + numProduct[count] + " ��., �������� � �������");
		count++;
	}

	public int getNumProduct(int i) {
		return numProduct[i];
	}

	public double getTotalCost() {
		return totalCost;
	}

	public void showCart() {
		int i = 0;
		System.out.println("� ��� � �������:");
		while (product[i] != null && i < 20) {
			System.out.println(product[i].getName() + " x " + getNumProduct(i) + " ��.");
			i++;
		}
	}

}

class Products {
	private static int count;
	private int id;
	private String name;
	private String manufacturer;
	private double rate;
	private double price;

	Products(String name, double price) {
		id = ++count;
		this.price = price;
		this.name = name;
	}

	Products(String name, double price, String manufacturer, double rate) {
		this(name, price);
		this.rate = rate;
		this.manufacturer = manufacturer;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return  "[" + name + ", ������������� = " + manufacturer + ", ������� = " + rate + ", ���� = " + price
				+ "]";
	}

}

public class Shop {

	public static void main(String[] args) {
		User user1 = new User("andi", "mpei34525");
		user1.setName("�������");
		Products product1 = new Products("����� � ������� 3.2% ", 60);
		Products product2 = new Products("������� �������� 3.2% ", 50);
		Products product3 = new Products("���������� 2.5%", 50, "�������� �������� �����", 4.6);

		Products product4 = new Products("���� �����", 200);
		Products product5 = new Products("������", 1000, "����� ������� �����", 5);
		Products product6 = new Products("��������� ��������", 800, "��������� ���", 4.8);

		Products product7 = new Products("�����", 50, "�� ���������", 4);
		Products product8 = new Products("�����������", 30, "����� ��. ��������", 3.34);
		Products product9 = new Products("Barilla", 70, "������ ������", 4.7);
		Products product10 = new Products("��� �����", 60, "����� ���", 4.2);

		Products product11 = new Products("�������", 55, "���������� ����� ���� ", 3.3);
		Products product12 = new Products("Corona Extra", 80, "�������, �������", 5);
		Products product13 = new Products("Miller", 65);

		Products product14 = new Products("��������", 30);
		Products product15 = new Products("�����", 30, "���", 2.4);
		Products product16 = new Products("Chappi", 80, "Chappi corp.", 4.4);

		Category meat = new Category("����", product4, product5, product6);
		Category milk = new Category("������", product1, product2, product3);
		Category beer = new Category("����", product11, product12, product13);
		Category forAnimal = new Category("������ ��� ��������", product14, product15, product16);
		Category pasta = new Category("��������", product7, product8, product9, product10);

		Products[] products = { product1, product2, product3, product4, product5, product6, product7, product8,
				product9, product10, product11, product12, product13, product14, product15, product16 };
		Category[] categories = { meat, milk, beer, forAnimal, pasta };
		// checkLogin(user1);
		
		for (Category c : categories) {
			System.out.print(c.getId() + "  " + c.getName() + "  ");
		}
		System.out.println();
		
		int cat=4;
//		cat=inputCheck(0, categories.length); 
		
		System.out.println("��������� "+cat +": " + categories[cat - 1].getName());
		System.out.println("�������� �����:");
		for (Products p : categories[cat - 1].getAllProducts()) {
			System.out.println(p.toString());
		}
		//cat = 2;
		System.out.println("�� �������: " + " "+ categories[cat-1].getProduct(1) + ", ������� ���� �������� � �������?");
//		int p1 = 14;
//		int n1 = 2;
//		int p2 = 6;
//		int n2 = 3;
//		Cart cart1 = new Cart();
//		cart1.addProduct(products[p1], n1);
//		cart1.addProduct(products[p2], n2);
//		System.out.println("�����: " + cart1.getTotalCost() + " ���.");
//		cart1.showCart();
	}
	
	public static int inputCheck(int start, int end) {
		int choice;
		System.out.println("���������� ������ ����� �� " + (start+1) + " �� "+ (end));
		Scanner s = new Scanner(System.in);
		if (s.hasNextInt()) {
			choice = s.nextInt();
			if ((choice<start) | (choice>end)) {
				System.out.println("������� ������������ ��������, ��������� ������������� ������� �����");
				choice=1;
			}
		return choice;
		}
		else return 1;
		
}
	
	public static void checkLogin(User user) {
		System.out.println("������������ ��� � ����� ��������!");
		System.out.println("������� �����:");
		Scanner scan1 = new Scanner(System.in);
		System.out.println("������� ������:");
		Scanner scan2 = new Scanner(System.in);
		if (scan1.hasNextLine() && scan2.hasNextLine()) {
			String l = scan1.nextLine();
			String p = scan2.nextLine();
			if (l.equals(user.getLogin()) && (p.equals(user.getPassword()))) {
				System.out.println("����� ����������, " + user.getName());
			} else {
				System.out.println("����� � ������ �� ������������");
			}
		}
	}
}
