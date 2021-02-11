package homeworkBruce.containers;
import java.util.*;
public class PersonGen {
	private String name;
	int  num=0;
	public String next() {
		switch (num) {
		default:
		case 0: num++; return "Turkish";
		case 1: num++; return "Cousin Avi"; 
		case 2: num++; return "Mickey O'Neil"; 
		case 3: num++; return"Brick Top";
		case 4: num++; return "Franky \"Four-Fingers\""; 
		case 5: num=0; return "\"Bullet-Tooth\" Tony";
		}
	}
	public void fillA(String[] a) {
		for (int i=0;i<a.length;i++) {
			a[i]=next();
		}
	}
	public Collection fill(Collection<String> c, int n) {
		for (int i=0;i<n;i++) {
			c.add(next());
			}
		return c;
	}
	public static void main(String[] args) {
		PersonGen pg = new PersonGen();
		String[] a= new String[10];
		pg.fillA(a);
		for (String el:a) {
			System.out.print(el+", ");
		}
		System.out.println();
		System.out.println(pg.fill(new ArrayList<String>(), 10));
		System.out.println(pg.fill(new LinkedList<String>(), 10));	
		System.out.println(pg.fill(new HashSet<String>(), 10));
		System.out.println(pg.fill(new TreeSet<String>(), 10));
		System.out.println(pg.fill(new LinkedHashSet<String>(), 10));
	}
}

