package Lesson7;

public class PhoneDemo {
	public static void main(String[] args) {
		Phone ph1 = new Phone();
		Phone ph2 = new Phone();
		Phone ph3 = new Phone("nokia", "5353535", 7);
		Phone ph4 = new Phone("ALCATEL", "3333");
		Phone ph5 = new Phone();
		Phone ph8 = new Phone();

		ph1.setModel("Samsung");
		ph1.setWeight(7.5);
		ph1.setNumber("634563456");

		ph2.setModel("Apple");
		ph2.setWeight(3.14);
		ph2.setNumber("61116");

		ph1.recieveCall("Мама");
		ph2.recieveCall("Папа");

		System.out.println(ph1.getNumber());
		System.out.println(ph2.getNumber());

		System.out.println(ph3.getModel());
		System.out.println(ph4.getModel());
		System.out.println(ph5.getModel());
		ph2.recieveCall("Сестра", "98540935");

		ph1.sendMessage("Hui", "452415", "421424");
		ph2.sendMessage("pizda", "112");

		Phone.membersOfClass();
	}
}
