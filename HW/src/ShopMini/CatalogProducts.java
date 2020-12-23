package ShopMini;

public class CatalogProducts {
	private static int num=0;
	private int position=0;
	private String name;
	private Product[] products;

	CatalogProducts(String name, Product... products) {
		this.name = name;
		this.products = products;
		position=num++;
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

	public int getPosition() {
		return position+1;
	}

	public void getProducts() {
		System.out.println(getName());
		for (Product prod:products) {
			System.out.print(prod.getName()+" " +prod.getId()+ " \t ");
		}
	}
	
}
