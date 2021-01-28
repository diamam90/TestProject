
package lesson12;

public class StringBuilderDemo {
	
	public static void main(String[] args) {
		StringBuilder str1= createSomeString(3,56);
		System.out.println(str1.toString());
		System.out.println(createSomeString(4,28).toString());
		modifySomeString(str1,"=", "равно");
		modifySomeString(str1,"+", "плюс");
		System.out.printf("HEllo world, %5s", 15);
		
	}
	private static StringBuilder createSomeString(int a, int b) {
		StringBuilder result = new StringBuilder();
		result.append(a).append(" + ").append(b).append(" = ").append(a+b).append("\n")
		.append(a).append(" x ").append(b).append(" = ").append(a*b).append("\n")
		.append(a).append(" - ").append(b).append(" = ").append(a-b).append("\n");
		return result;
	}
	private static void modifySomeString(StringBuilder str,
			String oldString, String newString) {
		int pos;
		while ((pos=str.indexOf(oldString)) != -1) {
			str.replace(pos, pos+1, newString);			
		}
		System.out.println(str.toString());	
	}
}
