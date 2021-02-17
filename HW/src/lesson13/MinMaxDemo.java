package lesson13;
class MinMax<T extends Number>{
	T[] array;
	MinMax(T[] array){
		this.array=array;
	}
	public void maximMin() {
		T min=array[0];
		T max= array[0];
		for (int i=0;i< array.length;i++){
			if (array[i].doubleValue()<min.doubleValue()) {min=array[i];}
			if (array[i].doubleValue()>max.doubleValue()) {max=array[i];}
		}
	System.out.println("Min = " + min+ " Max = "+ max);
	}
} 

public class MinMaxDemo {

	public static void main(String[] args) {
		MinMax<Integer> mm1 = new MinMax(new Integer[] {2,5,5,1,10,23,0,30});
		mm1.maximMin();
		MinMax<Double> mm2 = new MinMax(new Double[] {2.3, 3.14, 0.001, 67.0, 1.1});
		mm2.maximMin();
		
	}

}
