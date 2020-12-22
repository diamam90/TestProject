package Lesson11;

public class WrapperDemo {
	public static void main(String[] args) {
		Double double1=new Double(34.3); 
		Double double2=new Double("3.14");
		
		Byte byte1=0;
		Byte byte12=new Byte("7");
		
		Integer integer1=Integer.valueOf("1001010",9);
		Double double3=Double.valueOf("231231.3");
		
		Long long1=Long.parseLong("23123");
		long long2=Long.parseLong("123123", 4);
		String string1=Long.toString(254, 16);
		
		System.out.println(double1);
		System.out.println(double2);
		System.out.println(byte1);
		System.out.println(byte12);
		Byte b=2;
		b=3;
		System.out.println(b);
		System.out.println(integer1);
		System.out.println(double3);
		System.out.println(long1);
		System.out.println(long2);
		System.out.println(string1);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		System.out.println(2/0.0);
	}
}
