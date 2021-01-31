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
		System.out.println("Продукт " + product[count].getName() + " , ценой " + product[count].getPrice()
				+ " руб., в количестве " + numProduct[count] + " шт., добавлен в корзину");
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
		System.out.println("У Вас в корзине:");
		while (product[i] != null && i < 20) {
			System.out.println(product[i].getName() + " x " + getNumProduct(i) + " шт.");
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
		return  "[" + name + ", производитель = " + manufacturer + ", рейтинг = " + rate + ", цена = " + price
				+ "]";
	}

}

public class Shop {

	public static void main(String[] args) {
		User user1 = new User("andi", "mpei34525");
		user1.setName("Дмитрий");
		Products product1 = new Products("Домик в деревне 3.2% ", 60);
		Products product2 = new Products("Веселый молочник 3.2% ", 50);
		Products product3 = new Products("Волжаночка 2.5%", 50, "Волжский молочный завод", 4.6);

		Products product4 = new Products("Мясо птицы", 200);
		Products product5 = new Products("Фуагра", 1000, "завод мертвых тушек", 5);
		Products product6 = new Products("Мраморная говядина", 800, "Фрезерный цех", 4.8);

		Products product7 = new Products("Макфа", 50, "ПО макарошки", 4);
		Products product8 = new Products("Щебекинские", 30, "завод им. Щебекина", 3.34);
		Products product9 = new Products("Barilla", 70, "Просто Италия", 4.7);
		Products product10 = new Products("Аль денте", 60, "Денте аль", 4.2);

		Products product11 = new Products("Очаково", 55, "Очаковский завод пива ", 3.3);
		Products product12 = new Products("Corona Extra", 80, "Мексика, отвечаю", 5);
		Products product13 = new Products("Miller", 65);

		Products product14 = new Products("Волжанин", 30);
		Products product15 = new Products("Пегас", 30, "ЗЛК", 2.4);
		Products product16 = new Products("Chappi", 80, "Chappi corp.", 4.4);

		Category meat = new Category("мясо", product4, product5, product6);
		Category milk = new Category("молоко", product1, product2, product3);
		Category beer = new Category("пиво", product11, product12, product13);
		Category forAnimal = new Category("товары для животных", product14, product15, product16);
		Category pasta = new Category("макароны", product7, product8, product9, product10);

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
		
		System.out.println("Категория "+cat +": " + categories[cat - 1].getName());
		System.out.println("Выберите товар:");
		for (Products p : categories[cat - 1].getAllProducts()) {
			System.out.println(p.toString());
		}
		//cat = 2;
		System.out.println("Вы выбрали: " + " "+ categories[cat-1].getProduct(1) + ", сколько штук положить в корзину?");
//		int p1 = 14;
//		int n1 = 2;
//		int p2 = 6;
//		int n2 = 3;
//		Cart cart1 = new Cart();
//		cart1.addProduct(products[p1], n1);
//		cart1.addProduct(products[p2], n2);
//		System.out.println("Итого: " + cart1.getTotalCost() + " руб.");
//		cart1.showCart();
	}
	
	public static int inputCheck(int start, int end) {
		int choice;
		System.out.println("Необходимо ввести число от " + (start+1) + " до "+ (end));
		Scanner s = new Scanner(System.in);
		if (s.hasNextInt()) {
			choice = s.nextInt();
			if ((choice<start) | (choice>end)) {
				System.out.println("Введено некорректное значение, программа автоматически сделала выбор");
				choice=1;
			}
		return choice;
		}
		else return 1;
		
}
	
	public static void checkLogin(User user) {
		System.out.println("Приветствуем Вас в нашем магазине!");
		System.out.println("Введите логин:");
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Введите пароль:");
		Scanner scan2 = new Scanner(System.in);
		if (scan1.hasNextLine() && scan2.hasNextLine()) {
			String l = scan1.nextLine();
			String p = scan2.nextLine();
			if (l.equals(user.getLogin()) && (p.equals(user.getPassword()))) {
				System.out.println("Добро пожаловать, " + user.getName());
			} else {
				System.out.println("Логин и пароль не соответсвуют");
			}
		}
	}
}
