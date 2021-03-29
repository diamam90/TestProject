package Lesson9;

public abstract class Shape {
	private String color;

	Shape(String color) {
		this.color = color;
	};

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Shape other = (Shape) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Shape [color=" + color + "]";
	}

	public static void main(String[] args) {
		Circle circle1 = new Circle("Красный", 3, 4, 1);
		Circle circle2 = new Circle("Голубой", 0, 0, 2);
		Circle circle3 = new Circle("Голубой", 0, 0, 2);
		Rectangle rectangle1 = new Rectangle("Черный", 0, 0, 5, 5);
		Shape[] shapes = new Shape[3];
		shapes[0] = circle1;
		shapes[1] = circle2;
		shapes[2] = rectangle1;
		for (Shape element : shapes) {
			element.draw();
			System.out.println(element);
		}
		System.out.println(circle2.equals(circle3));
		System.out.println(circle2 == circle3);

	}

	public abstract void draw();

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		return result;
	}

}
