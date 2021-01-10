package homeworkBruce.polymorphism;
class Person{
	public String name;
	public int age=23;
	public String print() {
		return name;
	}
}
class Client extends Person{
	public int age = 26;
	public String fullName;
	public String print() {
		return fullName;
	}
	public void act() {System.out.println("Extend");}
}
public class Test {

	public static void main(String[] args) {
		Person pers = new Client();
		System.out.println(pers.age);
		System.out.println(pers.print());
	
	}
	
}
