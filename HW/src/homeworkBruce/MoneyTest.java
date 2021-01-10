package homeworkBruce;

public class MoneyTest {
	MoneyEnum countryMoney;
	public MoneyTest(MoneyEnum countryMoney) {
		this.countryMoney=countryMoney;
	}
	public void printInfo() {
		switch (countryMoney) {
			case DOLLAR:
				System.out.println("Dollar bill y'all");
				break;
			case EURO:
				System.out.println("euro");
				break;
			case POUND:
				System.out.println("pound");
				break;
			case PESO:
				System.out.println("peso");
				break;
			case YUAN:
				System.out.println("yuan");
				break;
			case KOREANWON:
				System.out.println("won");
				break;
		}
				
	}
	public static void main(String[] args) {
		MoneyTest usa=new MoneyTest(MoneyEnum.DOLLAR);
		MoneyTest korea=new MoneyTest(MoneyEnum.KOREANWON);
		usa.printInfo();
		korea.printInfo();
		for (MoneyEnum obj: MoneyEnum.values()) {
			System.out.println(obj + " " + obj.ordinal());
		}
	}

}
