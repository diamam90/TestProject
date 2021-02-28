package com.javastart.exceptions;

public class Main {
	public static void main(String[] args) {
		AccountRepository accRepo = AccountRepository.getInstance();
		Account account1 = new Account(1L, "Lori1", 10000);
		Account account2 = new Account(2L, "Lori2", 20000);
		Account account3 = new Account(3L, "Lori", 30000);
		accRepo.add(account1);
		accRepo.add(account2);
		accRepo.add(new Account(3L,"Lori3",30000));
		
		Account account = accRepo.getById(6L);
		}
}
