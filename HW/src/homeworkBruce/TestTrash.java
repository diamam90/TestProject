package homeworkBruce;

public class TestTrash {
	public static void main(String[] args) {
		New noob=new New(true);
		noob.checkIn();
		new New(true);
		System.gc();
		

	}
}
