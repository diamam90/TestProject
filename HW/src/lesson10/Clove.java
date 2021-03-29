package Lesson10;

public class Clove extends Flower {
	private String season;

	Clove(String country, int storageLife, double cost, String season) {
		super(country, storageLife, cost);
		this.season = season;
	}

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}

}
