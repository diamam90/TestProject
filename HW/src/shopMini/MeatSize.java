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
	/*switch (MeatSize) {
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
