package lesson14;

public class User1 {
	private String login,password;
	User1(String login,String password){
		this.login=login;
		this.password=password;
	}
	public class Query{
		public void printToLog() {
			System.out.printf("User with login %s and password %s sent query \n", login,password);
		}
	}
	public void createQuary() {
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
		User1 other = (User1) obj;
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
		return "User1 [login=" + login + ", password=" + password + "]";
	}
	public static void main(String[] args) {
		User1 user1= new User1("1","1");
		User1.Query query1 = user1.new Query();
		query1.printToLog();
		User1.Query query2 = new User1("login2","password2").new Query();
		query2.printToLog();
		user1.createQuary();
	}
}
