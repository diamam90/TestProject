package homeworkBruce.polymorphism;

public class PrivateOverride {
	private void f() {
		System.out.println("private f()");
	}
	private void info() {System.out.println("base");}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrivateOverride po = new Derived();
		Derived po1 = new Derived();
		po.f();
		po.info();
		po1.info();
	}

}
