package homeworkBruce;

public class New {
	boolean checkout=false;
	New(boolean checkout){
		checkout=checkout;
	}
	void checkIn() {
		checkout=false;
	}
	public void finalize() {
		if (checkout) {
			System.out.println("Error checkout");
		}
	}
}
