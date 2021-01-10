package homeworkBruce.polymorphism;

public class Circle extends Shape{
	@Override
	public void draw() {System.out.println("Circle.draw()");}
	public void erase() {System.out.println("Circle.erase()");}
	public void print() {System.out.println("Circle print");}
}
