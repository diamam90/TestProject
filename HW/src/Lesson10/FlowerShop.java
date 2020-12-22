package Lesson10;

public class FlowerShop {
	public static void main(String[] args) {
		Rose rose1=new Rose("���������", 5, 100, 80, "�������");
		Rose rose2=new Rose("���������", 5, 100, 80, "�����");
		Rose rose3=new Rose("������", 4, 80, 60, "�������");
		Rose rose4=new Rose("������", 4, 80, 70, "������");
		Tulip tulip1=new Tulip("�������", 2, 50, "�������", 25);
		Tulip tulip2=new Tulip("�������", 2, 45, "������", 25);
		Cactus cactus1=new Cactus("������", 3650, 1000, 5 );
		Cactus cactus2=new Cactus("������", 13650, 10000, 10 );
		Clove clove1=new Clove("��������", 2, 30, "����");
		Clove clove2=new Clove("��������", 3, 25, "�����");
		Clove clove3=new Clove("�����", 4, 27, "��������");
				
		Bouquet[] bouquets=new Bouquet[4];
		bouquets[0]=new Bouquet (rose1,rose2,rose3,rose2);
		bouquets[1]=new Bouquet (rose2,rose2,tulip1,tulip1,tulip1);
		bouquets[2]=new Bouquet (cactus2,cactus2);
		bouquets[3]=new Bouquet (clove3,clove3,clove3,clove1,clove1,clove1,clove2);
		for (Bouquet bouq:bouquets) {
			System.out.print("���� ������ ");	
			bouq.printCostB();
			System.out.println();
		}
		System.out.println("���������� ��������� ������: " + Bouquet.getNumbOfFlower());
	}
}


