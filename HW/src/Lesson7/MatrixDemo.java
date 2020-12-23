package Lesson7;

public class MatrixDemo {
	public static void main(String[] args) {
		Matrix matr1 = new Matrix(new double[][] { { 1.32, 2.22, 3 }, { 2.33, 1.52, 1.33 } });

		Matrix matr2 = new Matrix(new double[][] { { 5.34, 1.72, 3.33 }, { 4.1, 7.33, 9 }, { 5.341, 2, 1 } });

		matr1.summa(matr1.array, matr2.array);
		System.out.println();
		matr1.multiplication(3);

		System.out.println();
		matr2.multiplication(4);
	}
}