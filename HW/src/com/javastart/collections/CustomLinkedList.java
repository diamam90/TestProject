package com.javastart.collections;

public class CustomLinkedList<Element> {
	private Node<Element> first;
	private Node<Element> last;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	private class Node<Element>{
		Element item;
		Node<Element> next;
		Node<Element> prev;
		public Node(Element item,Node<Element> next,Node<Element> prev) {
			this.item = item;
			this.next = next;
			this.prev = prev;
		}
	
	}
}
