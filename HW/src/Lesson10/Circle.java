package Lesson10;

import static java.lang.Math.PI;

public class Circle {
	public static final double PI3DEC = 3.14;
	private double radius;
	private double lenght;
	private double square;

	public static void main(String[] args) {
		int i = 0;
		Circle circle1 = new Circle();
		circle1.radius = 5;
		Circle circle2 = new Circle();
		circle2.radius = 2;
		System.out.println();
		setSquare(circle1);

		setSquare(circle2);

		circle1.lenght = 2 * PI * circle1.radius;
		circle2.lenght = 2 * PI * circle2.radius;
		i++;

		System.out.println(i);
		System.out.println(circle2.toString());
		System.out.println(circle1.toString());
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", lenght=" + lenght + ", square=" + square + "]";
	}

	public static double setSquare(Circle circle) {
		circle.square = PI * (circle.radius) * (circle.radius);
		return circle.square;
	}

	public void getSquare() {
		System.out.println(square);
	}

}
