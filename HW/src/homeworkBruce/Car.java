package homeworkBruce;

public class Car {
	 Engine engine = new Engine();
	 Wheel[] wheels= new Wheel[4];
	 Door left = new Door(), right = new Door();
	 Car(){
		 for (int i=0; i<4; i++) {
			wheels[i] = new Wheel();
		 }
	 }
	public static void main(String[] args) {
		Car car = new Car();
		car.left.window.rollup();
		car.wheels[3].inflate(72);
		car.engine.service();
	}

}
