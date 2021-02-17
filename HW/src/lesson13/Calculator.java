package lesson13;

public class Calculator {
	private static <T extends Number> void sum(T a, T b) {
		System.out.println("Sum "+ a.doubleValue() +" + " +b.doubleValue()+" = " + (a.doubleValue()+b.doubleValue()));}
	private static <T extends Number> void multiply(T a, T b) {
		System.out.println("Multiply "+ a.doubleValue() +" x " +b.doubleValue()+" = " + (a.doubleValue()*b.doubleValue()));}
	private static <T extends Number> void divide(T a, T b) {
		System.out.println("Divide "+ a.doubleValue() +" / " +b.doubleValue()+" = " + (a.doubleValue()/b.doubleValue()));}
	private static <T extends Number> void substraction(T a, T b) {
		System.out.println("Substraction "+ a.doubleValue() +" - " +b.doubleValue()+" = " + (a.doubleValue()-b.doubleValue()));}
	public static void main(String[] args) {
		sum(3,4);
		multiply(1,2.3);
		divide(1,68);
		substraction(3,23);

	}

}
