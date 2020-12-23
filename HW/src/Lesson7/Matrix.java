package Lesson7;

import java.util.Arrays;

public class Matrix {

	int rows;
	int columns;
	double[][] array;

	Matrix(double[][] array) {
		setArray(array);
		print(array);
	}

	void setArray(double[][] array) {
		this.array = array.clone();
		this.columns = array[0].length;
		this.rows = array.length;
	}

	int getRows() {
		return rows;
	}

	int getColumns() {
		return columns;
	}

	void summa(double[][] array1, double[][] array2) {
		boolean checkDim = true;

		if (array1.length == array2.length) {
			int n = 0;
			n = array1.length < array2.length ? array1.length : array2.length;
			for (int i = 0; i < n; i++) {
				if (array1[i].length != array2[0].length) {
					checkDim = false;
				}
			}
		} else {
			checkDim = false;
		}

		if (checkDim) {
			double[][] sum = new double[array1.length][array[0].length];
			for (int i = 0; i < array1.length; i++) {
				for (int j = 0; j < array1[0].length; j++) {
					sum[i][j] = array1[i][j] + array2[i][j];
				}
				System.out.println(Arrays.toString(sum[i]));
			}

		} else {
			System.out.println("Размерность матриц не совпадает");
		}
	}

	void multiplication(int number) {
		double[][] mult = new double[rows][columns];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				mult[i][j] = array[i][j] * number;
			}
		}
		print(mult);
	}

	void print(double[][] array) {
		for (double[] str : array) {
			System.out.println(Arrays.toString(str));
		}
		System.out.println();
	}
}
