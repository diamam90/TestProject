package Lesson9;

public class User {
	private String login;
	private String password;
	private Basket basket;
	User(String login, String password, Basket basket){
		this.login=login;
		this.password=password;
		this.basket=basket;
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
	public Basket getBasket() {
		return basket;
	}
	public void setBasket(Basket basket) {
		this.basket = basket;
	}
	public void printUserInfo() {
		System.out.println("Покупатель:");
		System.out.print("\t" + getLogin()+ " " + getPassword());
		System.out.println();
	}
}
