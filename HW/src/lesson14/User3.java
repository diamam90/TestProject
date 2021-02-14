package lesson14;

import lesson14.User1.Query;

public class User3 {
	private static String login, password;
	public static class Query {
		public void printToLog() {
			System.out.printf("User with login %s and password %s sent query \n", login, password);
		}
	}
	public static void initialize(String login, String password) {
		User3.login=login;
		User3.password=password;
	}

	public static void main(String[] args) {
		initialize("login", password);
		User3.Query query1 = new User3.Query();
		query1.printToLog();
	}
}
