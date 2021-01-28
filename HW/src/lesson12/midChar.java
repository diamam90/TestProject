package lesson12;

public class midChar {
	public static String method(String s) {
//		char ch1=s.charAt(s.length()/2);
//		char ch2=s.charAt((s.length()/2)+1);
//		String str=ch1+""+ch2;
		return s.substring((s.length())/2-1, (s.length())/2+1);
	}
	public static void main(String[] args) {
		System.out.println(method("string"));
		System.out.println(method("code"));
		System.out.println(method("Practice"));
	}

}
