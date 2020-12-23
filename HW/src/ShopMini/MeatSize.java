package ShopMini;

public enum MeatSize {
	SMALL(0.300), STANDART(0.800), LARGE(1.200);
	private double weight;
	MeatSize(double weight){
		this.weight=weight;
	}
	public double getWeight() {
		return weight;
	}
	
}
