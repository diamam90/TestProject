package homeworkBruce;

public class Frog extends Amphubian {
	protected void print() {
		System.out.println("Ёто класс-наследник");
	}
	protected void swim() {
		System.out.println("Ћ€гушка плывет");
	}
	public static void main(String[] args) {
		Frog frog = new Frog();
		frog.swim();
		frog.print();
	}

}
