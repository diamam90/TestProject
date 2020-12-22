package Lesson6;

import java.util.Arrays;

public class ArrayInvert {

	public static void main(String[] args) {
		print( new int [] {});
		print( new int [] {1});
		print( new int [] {1,4,5});
		print( new int [] {1,4,5,6,7,9});
		
	}
	public static void print(int array[]) {
		System.out.print(Arrays.toString(array) +"\t");
		ArrayInverter.invert(array);
		System.out.println(Arrays.toString(array));
	}
}
