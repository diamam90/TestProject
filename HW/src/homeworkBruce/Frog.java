package homeworkBruce;

public class Frog extends Amphubian {
	protected void print() {
		System.out.println("��� �����-���������");
	}
	protected void swim() {
		System.out.println("������� ������");
	}
	public static void main(String[] args) {
		Frog frog = new Frog();
		frog.swim();
		frog.print();
	}

}
