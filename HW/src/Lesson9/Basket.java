package Lesson9;

public class Basket {
	private Product[] boughtProducts;
	Basket(Product... boughtProducts){
		this.boughtProducts=boughtProducts;
	}
	public Product[] getBoughtProducts() {
		return boughtProducts;
	}

	public void setBoughtProducts(Product[] boughtProducts) {
		this.boughtProducts = boughtProducts;
	}
	public void printBasket() {
		System.out.println("В корзине:");
		for (Product element: boughtProducts) {

			System.out.print(element.getCategory()+" " +element.getNameProduct()+ " \t");
		}
		System.out.println();
	}
}
