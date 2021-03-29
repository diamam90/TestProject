package Lesson8;

public class Students {
	private String firstName, lastName, group;
	private double avgMark;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public double getAvgMark() {
		return avgMark;
	}

	public void setAvgMark(double avgMark) {
		this.avgMark = avgMark;
	}

	Students(String firstName, String lastName, String group, double avgMark) {
		this.avgMark = avgMark;
		this.firstName = firstName;
		this.lastName = lastName;
		this.group = group;
		getScholarship();

	}

	Students() {
		getScholarship();
	}

	public double getScholarship() {
		return avgMark == 5 ? 100 : 80;

	}

}
