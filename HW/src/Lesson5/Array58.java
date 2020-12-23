package Lesson5;

import java.util.Arrays;

public class Array58 {

	public static void main(String[] args) {
		double[][] array = new double[5][8];
		double[][] array52 = new double[5][2];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 8; j++) {
				array[i][j] = Math.random() * 20;
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < 5; i++) {
			array52[i][0] = array[i][0];
			array52[i][1] = array[i][0];
			for (int j = 0; j < 8; j++) {
				if (array52[i][0] < array[i][j]) {
					array52[i][0] = array[i][j];
				}
				if (array52[i][1] > array[i][j]) {
					array52[i][1] = array[i][j];
				}
			}
			System.out.print(Arrays.toString(array52[i]));
			System.out.println();

		}

	}
}
