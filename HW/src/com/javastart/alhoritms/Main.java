package com.javastart.alhoritms;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("AAA");
		list.add("BBB");
		list.add("CCC");
		list.add("DDD");
		System.out.println(LinearSearch(list, "BBB"));
		int[] arr=new int[] {3,5,7,1,4,3};
		for (int i:arr) {System.out.print(i+" ");}
		System.out.println();
		bubbleSort(arr);
		for (int i:arr) {System.out.print(i+" ");}
	}
	private static int LinearSearch(List<String> list, String arg) {
		for (int i=0; i<list.size();i++) {
			if (list.get(i)==arg) {return i;}
		}
		return -1;
	}
	private static void bubbleSort(int[] arr) {
		for (int i=arr.length-1;i>0;i--) {
			for (int j=0;j<i;j++) {
				if (arr[j]>arr[j+1]) {
					int a=0;
					a=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=a;
				}
			}
		}
	}
}
