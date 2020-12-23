package ShopMini;
import java.util.Scanner;
public class ShopShop {
	private static void categoryChoice(CatalogProducts[] categories) {
		System.out.println("Выберите категорию товаров:");
		for (CatalogProducts cat: categories) {
			System.out.print(cat.getPosition() + " " + cat.getName() + " \t ");
		}
		System.out.println();
		Scanner scanner =new Scanner(System.in);
		if (scanner.hasNextInt()) {
			int categoryChoice=scanner.nextInt();
			categoryChoice--;
			categories[categoryChoice].getProducts();
		}
	}
	public static void main(String[] args) {
		Product product1 = new Product("Домик в деревне 3.2% ", 60, 4.3);
		Product product2 = new Product("Веселый молочник 3.2% ", 50, 4.10);
		Product product3 = new Product("Волжаночка 2.5%", 50, 4.6);

		Product product4 = new Product("Мясо птицы", 200, 3.2);
		Product product5 = new Product("Фуагра", 1000, 5);
		Product product6 = new Product("Мраморная говядина", 800, 4.8);

		Product product7 = new Product("Макфа", 50, 4);
		Product product8 = new Product("Щебекинские", 30, 3.34);
		Product product9 = new Product("Barilla", 70, 4.7);
		Product product10 = new Product("Аль денте", 60, 4.2);

		Product product11 = new Product("Очаково", 55, 3.3);
		Product product12 = new Product("Corona Extra", 80, 5);
		Product product13 = new Product("Miller", 65, 4.2);
		Product product14 = new Product("Волжанин", 30, 2.5);
		Product product15 = new Product("Пегас", 30, 2.4);
		
		CatalogProducts category1 = new CatalogProducts ("Пиво", product11, product12, product13, product14, product15);
		CatalogProducts category2 = new CatalogProducts ("Макароны", product7, product8, product9, product10);
		CatalogProducts category3 = new CatalogProducts ("Молоко", product1, product2, product3);
		CatalogProducts category4 = new CatalogProducts ("Мясо", product4, product5, product6);
		CatalogProducts[] categories= {category1,category2,category3,category4};
		
		/*User user1 = new User();
		User.printInfo(user1);*/
		categoryChoice(categories);
		/*System.out.println("Выберите товар");
		Scanner scanner=new Scanner(System.in);
		if (scanner.hasNextInt()) {
			int productChoice=scanner.nextInt();
			productChoice--;
			;
		switch (MeatSize) {
			case SMALL: 
				System.out.println("Вы на диете?!");
				break;
			case LARGE: 
				System.out.println("Большому куску и рот радуется!");
				break;	
			case STANDART: 
				System.out.println("Вы выбрали стандарную порцию");
				break;
			
	}*/
		
	

		}
	}

