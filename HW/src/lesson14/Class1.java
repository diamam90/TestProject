package lesson14;

import com.javastart.collections.CustomLinkedList;

public class Class1 {
	public static void main(String[] args) {
		CustomLinkedList<String> cll1= new CustomLinkedList<>();
		cll1.add("SALAM ALEIKUM!");
		cll1.add("VALEIKUM ASSALAM!");
		cll1.add("Shalom");
		cll1.add("Shalom");
		cll1.addFirst("AZAZA");
		cll1.addFirst("ASSA");
		
		for (int i=0;i<cll1.size();i++) {
			System.out.print(cll1.get(i)+ " ");
		}
		System.out.println();
		cll1.delete(2);
		for (String e:cll1) {
			System.out.print(e+" ");
		}
}
}
