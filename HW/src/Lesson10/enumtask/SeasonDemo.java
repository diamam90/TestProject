package Lesson10.enumtask;

public class SeasonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Season season = Season.SPRING;
		System.out.println(season);
		print(Season.AUTUMN);
		printAllValues();
		Season seasonNum = Season.valueOf("SPRING");
		System.out.println(seasonNum);
	}

	public static void printAllValues() {
		for (Season s : Season.values()) {
			System.out.println(s + " " + s.ordinal() + " " + s.getAvgTemp() + " " + s.getDescription());
		}
	}

	public static void print(Season season) {
		switch (season) {
		case SUMMER:
			System.out.println("I like summer!");
			break;
		case AUTUMN:
			System.out.println("Hmmmm AUTUMN...I like it!");
			break;
		case WINTER:
			System.out.println("I hate to get cold %(");
			break;
		case SPRING:
			System.out.println("In spring the weather is often nice and warm");
			break;
		}
	}
}
