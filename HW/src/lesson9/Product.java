package Lesson9;

public class Product {
	private String nameProduct;
	private double cost;
	private double rate;
	private String category;

	Product(String nameProduct, double cost, double rate) {
		this.nameProduct = nameProduct;
		this.cost = cost;
		this.rate = rate;
	}

	public String getNameProduct() {
		return nameProduct;
	}

	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public void printProduct() {
		// System.out.println("Продукт:");
		System.out.print("\t" + getNameProduct() + " , цена " + getCost() + " , рейтинг " + getRate());
		System.out.println();
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

}
