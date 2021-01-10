package homeworkBruce;

public class C extends A{
	B objB = new B();
	C(int i){
		super(i);
	}
	C(){
		super(3);
		System.out.println("without constructor");
	}
	public static void main(String[] args) {
		C element = new C(3);
		//System.out.println()
		C element2= new C();
	}
}
