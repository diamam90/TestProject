package homeworkBruce.polymorphism;
class Super{
	public int field = 0;
	public int getField() {return field;}
	public void print() {System.out.println("Base");}
}
class Sub extends Super{
	public int field = 1;
	public int getField() {return field;}
	public int getSuperField() { return super.field;}
	public void print() {System.out.println("Extends");}
}
public class FieldAccess {

	public static void main(String[] args) {
		Super sup = new Sub();
		Sub sub = new Sub();
		System.out.println("sup.field = " + sup.field + " sup.getField() = " + sup.getField() + "\n ");
		System.out.println("sub.field = " + sub.field + " sub.getField() = " + sub.getField() + " sub.getSuperField() = "+ sub.getSuperField());
		sup.print();
	}

}
