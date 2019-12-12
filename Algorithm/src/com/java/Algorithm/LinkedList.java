package com.java.Algorithm;

import com.java.Node;

public class LinkedList<D> extends Algorithm {
	protected Node<D> head;
	protected Node<D> tail;
	protected Node<D> temp;
	protected int size;
	
	public Node<D> search(int index) {
		if(index == 0) return head;
		else if(index == size - 1) return tail;
		else if(index <= size && index > 0) {
			temp = head;
			
			for(int i = 0; i < index; i++) {
				temp = temp.getNext();
				if(i == index - 1) return temp;
			}
		}
		return null;
	}
	
	public void allPrint() {
		temp = head;
		StringBuilder str = new StringBuilder();
		while(temp.getNext() != null) {
			str.append(temp.getData() + " ");
			temp = temp.getNext();
		}
		
		str.append(temp.getData() + " ");
		
		System.out.println(str);
	}
	
	public void clear() {
		head = null;
		tail = null;
		temp = null;
	}
}
