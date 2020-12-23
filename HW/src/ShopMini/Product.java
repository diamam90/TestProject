package ShopMini;

public class Product {
	private static int amount;
	private String name;
	private double price;
	private double rate;
	private double weight;
	private double totalCost;
	private int id;

	Product(String name, double price, double rate) {
		amount++;
		id=amount;
		this.name = name;
		this.price = price;
		this.rate = rate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCost(double price) {
		this.price = price;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setTotalCost(double weight, double price) {
		totalCost = weight * price;
	}
}
