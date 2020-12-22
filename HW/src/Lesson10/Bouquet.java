package Lesson10;

public class Bouquet {
	private static int numbOfFlower;
	Flower[] flowers;
	private double costB;
	Bouquet(Flower... flowers){
		this.flowers=flowers;
		numbOfFlower+=flowers.length;
	}
	
	public void setCostB() {
		for (Flower flows:flowers) {
			costB+=flows.getCost();
		}
	}
	public double getCostB() {
		return costB;
	}
	public void printCostB() {
		setCostB();
		System.out.println(getCostB());
	}

	public static int getNumbOfFlower() {
		return numbOfFlower;
	}
	
	
}
