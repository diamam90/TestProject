package Lesson9;

public class Category {
	private String nameCategory;
	private Product[] products;

	Category(String nameCategory, Product... products) {
		this.nameCategory = nameCategory;
		this.products = products;
		for (Product element : products) {
			element.setCategory(nameCategory);
		}

	}

	public String getNameCategory() {
		return nameCategory;
	}

	public void setNameCategory(String nameCategory) {
		this.nameCategory = nameCategory;
	}

	public Product[] getProducts() {
		return products;
	}

	public void setProducts(Product[] products) {
		this.products = products;
	}

	public void printCategory() {
		System.out.println("Категория: " + getNameCategory());
		for (Product element : products) {
			element.printProduct();
		}
	}
}
