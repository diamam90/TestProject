package Lesson9;

public class Circle extends Shape {
	private int x, y, r;

	Circle(String color, int x, int y, int r) {
		super(color);
		this.x = x;
		this.y = y;
		this.r = r;
	}

	@Override
	public void draw() {
		System.out.print(getColor() + " круг с координатами (" + getX() + " ; " + getY() + ") и радиусом " + getR());
		System.out.println();

	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + r;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle other = (Circle) obj;
		if (r != other.r)
			return false;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Circle [x=" + x + ", y=" + y + ", r=" + r + ", " + super.toString();
	}

}
