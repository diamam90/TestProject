package Lesson7;
import Lesson7.Matrix;
public class MatrixDemo {
	public static void main(String[] args) {
		Matrix<Integer> matr1 = new Matrix(new Integer[][] {{3,4,5},{1,1,1}});
		Matrix<Integer> matr2 = new Matrix(new Integer[][] {{7,7,7},{8,8,9}});
		Matrix<Double> matr3 = new Matrix(new Double[][] {{3.1,4.1,5.1},{1.1,1.2,1.3}});
		Matrix.summa(matr1, matr2);
		System.out.println();
		matr1.multiplication(3);

		System.out.println();
		matr2.multiplication(4);
	}
}