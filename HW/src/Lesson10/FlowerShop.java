package Lesson10;

public class FlowerShop {
	public static void main(String[] args) {
		Rose rose1=new Rose("Голландия", 5, 100, 80, "красный");
		Rose rose2=new Rose("Голландия", 5, 100, 80, "белый");
		Rose rose3=new Rose("Россия", 4, 80, 60, "красный");
		Rose rose4=new Rose("Россия", 4, 80, 70, "желтый");
		Tulip tulip1=new Tulip("Франция", 2, 50, "красный", 25);
		Tulip tulip2=new Tulip("Франция", 2, 45, "желтый", 25);
		Cactus cactus1=new Cactus("Африка", 3650, 1000, 5 );
		Cactus cactus2=new Cactus("Турция", 13650, 10000, 10 );
		Clove clove1=new Clove("Беларусь", 2, 30, "зима");
		Clove clove2=new Clove("Беларусь", 3, 25, "осень");
		Clove clove3=new Clove("Литва", 4, 27, "всесезон");
				
		Bouquet[] bouquets=new Bouquet[4];
		bouquets[0]=new Bouquet (rose1,rose2,rose3,rose2);
		bouquets[1]=new Bouquet (rose2,rose2,tulip1,tulip1,tulip1);
		bouquets[2]=new Bouquet (cactus2,cactus2);
		bouquets[3]=new Bouquet (clove3,clove3,clove3,clove1,clove1,clove1,clove2);
		for (Bouquet bouq:bouquets) {
			System.out.print("Цена букета ");	
			bouq.printCostB();
			System.out.println();
		}
		System.out.println("Количество проданных цветов: " + Bouquet.getNumbOfFlower());
	}
}


