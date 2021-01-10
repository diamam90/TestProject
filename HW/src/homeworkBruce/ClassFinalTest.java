package homeworkBruce;

public class ClassFinalTest {
	public final String str;
	public final Test obj;
	ClassFinalTest(){
		str="azaza";	
		System.out.println(str);
		obj= new Test();
	}
	ClassFinalTest(String s){
		str="wahaha";
		System.out.println(str+s);
		obj = new Test(3);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassFinalTest cft1=new ClassFinalTest();
		ClassFinalTest cft2= new ClassFinalTest("PA TA TA TA TA");
		//cft2.obj = new Test(4);
	}

}
