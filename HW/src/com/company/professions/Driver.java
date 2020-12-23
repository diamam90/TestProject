package com.company.professions;

import Lesson7.Person;

public class Driver extends Person {
	private int experience;

	public Driver(String fullName, int age, int experince) {
		super(fullName, age);
		setExperience(experience);
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public void printInfoDriver() {
		System.out.print(
				"Имя водителя: " + getFullName() + ", возраст: " + getAge() + ", опыт вождения: " + getExperience());
	}
}
