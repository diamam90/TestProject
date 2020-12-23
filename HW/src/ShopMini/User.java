package ShopMini;

import java.util.Scanner;

public class User {
	private String login;
	private String password;

	User() {
		System.out.println("Введите логин:");
		Scanner log = new Scanner(System.in);
		this.login = log.nextLine();
		System.out.println("Введите пароль:");
		Scanner pass = new Scanner(System.in);
		this.password = pass.nextLine();
		System.out.println("Добро пожаловать!");
	}

	public static void printInfo(User user) {
		System.out.println();
		System.out.print(user.getLogin() + " " + user.getPassword());
		System.out.println();
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
