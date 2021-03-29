package Lesson6;

public class ArrayInverter {
	public static void invert(int array[]) {
		int num = array.length;
		int temp = 0;
		for (int i = 0; i < num / 2; i++) {
			temp = array[i];
			array[i] = array[num - 1 - i];
			array[num - 1 - i] = temp;
		}
	}
}
