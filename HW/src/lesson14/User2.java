package lesson14;

import lesson14.User1.Query;

public class User2 {
	private String login,password;
	User2(String login,String password){
		this.login=login;
		this.password=password;
	}
	
	public void createQuary() {
		class Query{
			public void printToLog() {
				System.out.printf("User with login %s and password %s sent query \n", login,password);
			}
		}
		Query query = new Query();
		query.printToLog();
	}	public String getLogin() {
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
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((login == null) ? 0 : login.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User2 other = (User2) obj;
		if (login == null) {
			if (other.login != null)
				return false;
		} else if (!login.equals(other.login))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		return true;
	}
	 
	@Override
	public String toString() {
		return "User2 [login=" + login + ", password=" + password + "]";
	}
	public static void main(String[] args) {
		User2 user= new User2("1","1");
		user.createQuary();
	}
}
