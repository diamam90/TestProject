package com.javastart.exceptions;

public class Account {
	private Long id;
	private String name;
	private Integer bill;
	public Account(Long id,String name, Integer bill) {
		this.id=id;
		this.name=name;
		this.bill=bill;
	}
	public Long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBill() {
		return bill;
	}
	public void setBill(int bill) {
		this.bill = bill;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", bill=" + bill + "]";
	}
	
}
