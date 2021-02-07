package homeworkBruce.Ex6;
import homeworkBruce.Ex6InnerClass;
import homeworkBruce.polymorphism.music.interfaces.InterfaceDemo;

public class ExtendsInner extends Ex6InnerClass {
	
	public static void main(String[] args) {
		Ex6InnerClass ec = new Ex6InnerClass();
		InterfaceDemo id= ec.inner();
			}
}

