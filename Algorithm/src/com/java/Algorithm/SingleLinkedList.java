package com.java.Algorithm;

import com.java.Node;

public class SingleLinkedList<D> extends LinkedList<D> {
	private Node<D> newNode;
	
	public void addFirst(D data) {
		if(head == null) {
			head = new Node<D>(data);
			tail = head;
		} else {
			head = new Node<D>(head, data);
		}
		
		size++;
	}
	
	public void addLast(D data) {
		if(tail == null) {
			addFirst(data);
		} else {
			newNode = new Node<D>(data);
			tail.setNext(newNode);
			tail = newNode;
		}
		
		size++;
	}
	
	public Node<D> remove(int index) {
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
	
	public void removeFirst() {
		temp = head.getNext();
		head = temp;
		
		size--;
	}
	
	public void print() {
	}
	
	public int size() {
		return size;
	}
}
