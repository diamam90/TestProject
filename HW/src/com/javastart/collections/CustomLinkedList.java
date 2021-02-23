package com.javastart.collections;

public class CustomLinkedList<Element> {
	private Node<Element> first;
	private Node<Element> last;
	
	private int size;
	
	public void add(Element element) {
		if (first == null) {
			 Node<Element> node = new Node<>(element,null,null);
			 first = node;
			 last = node;
		} else {
			Node<Element> node = new Node<>(element, null, last);
			last.next = node;
			last = node; 
		}
		size++;
	}
	public void addFirst(Element element) {
		
		Node<Element> newFirstElement = new Node<>(element,first,null);
		first.prev=newFirstElement;
		first=newFirstElement;
		size++;
 	}
	public void delete(int index) {
		Node<Element> deleteNode=getNodeByIndex(index);
		Node<Element> prevDN=deleteNode.prev;
		Node<Element> nextDN=deleteNode.next;
		prevDN.next=nextDN;
		nextDN.prev=prevDN;
		size--;
		
	}
	public Node<Element> getNodeByIndex(int index){
		Node<Element> result=first;
		for (int i=0; i<index;i++) {
			 result=result.next;
		}
		return result;
	}
	public Element first() {return first.item;}
	public Element last() {return last.item;}
	
	public Element get(int index){
		return getNodeByIndex(index).item;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	private static class Node<Element>{
		Element item;
		Node<Element> next;
		Node<Element> prev;
		public Node(Element item,Node<Element> next,Node<Element> prev) {
			this.item = item;
			this.next = next;
			this.prev = prev;
		}
	
	}
	public int size() {
		return size;
	}
}
