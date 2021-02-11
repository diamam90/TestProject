package homeworkBruce.containers;
import java.util.*;
public class Ex12 {
	
	public static void main(String[] args) {
		Random rand= new Random(35);
		List<Integer> list1 = new ArrayList<Integer>();
		for (int i=0;i<10;i++) {
			list1.add(rand.nextInt(20));
		}
		System.out.println(list1.toString());
		System.out.println();
		List<Integer> list2 = new ArrayList<Integer>(list1.size());
		ListIterator<Integer> iter1 = list1.listIterator(list1.size());
		ListIterator<Integer> iter2 = list2.listIterator();
		
		while (iter1.hasPrevious()) {
//			System.out.print(iter1.previous()+ " ");
		list2.add(iter1.previous());
		}
		System.out.println(list2);
	}

}
