package homeworkBruce;
	import java.util.*;
public class StaticFinalTest {
	private String name;
	public StaticFinalTest(String s) { name = s;  } 
	static final Test sft = new Test(); // constant reference address
	private final Test ft = new Test();
	static final String SFS = "static final"; // class constant
	private final String fs = "final";
	private static Random rand = new Random();
	static final int SFI = rand.nextInt(); // class constant 
	private final int fi = rand.nextInt();
	public String toString() {
		return (name + ": " + sft + ", " + ft + ", " + SFS + ", " + fs + ", " + SFI + ", " + fi);   
	} 		
	public static void main(String[] args) {
		StaticFinalTest d1 = new StaticFinalTest("d1");
		StaticFinalTest d2 = new StaticFinalTest("d2");
		StaticFinalTest d3 = new StaticFinalTest("d3");
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
	}}
