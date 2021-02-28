package com.javastart.exceptions;
import java.util.ArrayList;
import java.util.List;
public class AccountRepository {
	private static AccountRepository INSTANCE;
	private List<Account> accountList = new ArrayList<>();
	private AccountRepository() {}
	
	public static AccountRepository getInstance() {
		if (INSTANCE==null) {
			INSTANCE = new AccountRepository();
		}
		return INSTANCE;
	}
	public void add(Account account) {
		accountList.add(account);
	}
	public Account getById(Long id) {
		for (Account acc:accountList) {
			if (acc.getId().equals(id)) {
				return acc;
			}
		}
		throw new AccountNotFoundException("Can't find account with id: " + id);
	}
}
