package homeworkBruce;

public class Connection {
	private static int num;
	private Connection() {
		num++;
		System.out.println("������ "  + num + " ������");
	}
	public static Connection makeConnect() {
		if (num<3) {
			return new Connection();
			}
		else { 
			return null;
			}
	}
	
}
