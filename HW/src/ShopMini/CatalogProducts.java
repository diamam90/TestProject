package ShopMini;

public class CatalogProducts {
	private static int amount=0;
	private int num=0;
	private String name;
	private Product[] products;

	CatalogProducts(String name, Product... products) {
		this.name = name;
		this.products = products;
		amount++;
		num=amount;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNum() {
		return num;
	}
	public void getProducts() {
		System.out.println(getName());
		int i=0;
		for (Product prod:products) {
			i++;
			System.out.print(i + " " +prod.getName() + " \t ");
			}
		System.out.println();
	}
	public void printProduct(int num) {
		System.out.println(products[num].getName()+" "+ products[num].getPrice());
	}
}
