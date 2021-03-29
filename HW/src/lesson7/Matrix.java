package Lesson7;

import java.util.Arrays;

public class Matrix<T extends Number> {

	int rows;
	int columns;
	T[][] array;

	Matrix(T[][] array) {
		setArray(array);
		print(array);
	}

	void setArray(T[][] array) {
		this.array = array.clone();
		this.columns = array[0].length;
		this.rows = array.length;
	}
	public T[][] getArray() {
		return array;
	}
	int getRows() {
		return rows;
	}

	int getColumns() {
		return columns;
	}

	static void summa(Matrix<?> m1,Matrix<?> m2) {
		boolean checkDim=true;
		
		if (m1.getArray().length == m2.getArray().length) {
			checkDim=true;
			int n = 0;
			n = m1.getArray().length < m2.getArray().length ? m1.getArray().length : m2.getArray().length;
			for (int i = 0; i < n; i++) {
				if (m1.getArray()[i].length != m2.getArray()[0].length) {
					checkDim = false;
				}
			}
		} 
		if (checkDim) {
			double[][] sum = new double[m1.getArray().length][m1.getArray()[0].length];
			for (int i = 0; i < m1.getArray().length; i++) {
				for (int j = 0; j < m1.getArray()[0].length; j++) {
					sum[i][j] = m1.getArray()[i][j].doubleValue()+m2.getArray()[i][j].doubleValue();
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
				mult[i][j] = array[i][j].doubleValue() * number;
			}
		}
		for (double mu[]:mult) {
			for (double m:mu) {
				System.out.print(m+" ");
			}
			System.out.println();
		}
	}

	void print(T[][] array) {
		for (T[] str : array) {
			System.out.println(Arrays.toString(str));
		}
		System.out.println();
	}
}
