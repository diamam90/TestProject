package homeworkBruce.polymorphism;
import java.util.*;
public class RandomShapeGenerator {
	Random rand = new Random(60);
	public Shape next() {
		switch(rand.nextInt(4)) {
			default:
			case 0: return new Circle();
			case 1: return new Square();
			case 2: return new Triangle();
			case 3: return new Rhombus();
		}	
	}
}
