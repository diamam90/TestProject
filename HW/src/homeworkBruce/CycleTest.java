package homeworkBruce;
interface Cycle {
	static int wheels=0;;
	void ride() ;
	int getWheels();
}

class Unicycle implements Cycle {
	private static int wheels = 1;
	@Override
	public String toString() {
		return "Unicycle []";
	}
	public int getWheels() {
		return wheels;
	}
	public void balance() {System.out.println("Balance Unicycle");}
	public void ride() {}
}

class Bicycle implements Cycle {
	private static int wheels = 2;
	public String toString() {
		return "Bicycle []";
	}
	public int getWheels() {
		return wheels;
	}
	public void ride() {}
	public void balance() {System.out.println("balance Bicycle");}
}
class Tricycle implements Cycle {
	private  int wheels = 3;
	public String toString() {
		return "Tricycle []";
	}
	public int getWheels() {
		return wheels;
	}
	public void ride() {}
}

public class CycleTest {

	public static void main(String[] args) {
		Unicycle ride1= new Unicycle();
		Tricycle ride2 = new Tricycle();
		Bicycle ride3 = new Bicycle();
		ride1.ride();
		ride2.ride();
		ride3.ride();
		System.out.println(ride1.getWheels());
		System.out.println(ride2.getWheels());
		System.out.println(ride3.getWheels());
		Cycle ride4 = new Unicycle();
		Cycle ride5 = new Tricycle();
		Cycle ride6 = new Bicycle();
//		ride4.balance();
//		ride5.balance();
//		ride6.balance();
		((Unicycle)ride4).balance();	
	//	((Tricycle)ride5).balance();
		((Bicycle)ride6).balance();
	}

}
