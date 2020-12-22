package Lesson8;

public class TestClass3 extends TestClass1 {
	public static void main(String[] args) {
		System.out.println(TestClass1.a);
		//System.out.println(TestClass1.b); // не видно приват
		System.out.println(TestClass1.c);
		System.out.println(TestClass1.d);
	}

}
