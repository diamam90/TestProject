package homeworkBruce;

import homeworkBruce.polymorphism.music.interfaces.InterfaceDemo;
public class Ex6InnerClass {
	protected class Inner implements InterfaceDemo {
		public void print() {System.out.println("Implementss InterfaceDemo");}
	
	}
	public InterfaceDemo inner() {
		return new Inner();
	}
}
