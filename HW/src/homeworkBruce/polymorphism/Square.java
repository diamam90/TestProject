package homeworkBruce.polymorphism;

public class Square extends Shape {
	@Override
	public void draw() {System.out.println("Square.draw()");}
	public void erase() {System.out.println("Square.erase()");}
	public void print() {System.out.println("Square print");}
}
