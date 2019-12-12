package com.java;

public class Node<D> {
	private Node<D> next;
	private D data;
	
	public Node(D data) {
		this.data = data;
	}
	public Node(Node<D> next, D data) {
		this.next = next;
		this.data = data;
	}

	public D getData() {
		return data;
	}

	public void setData(D data) {
		this.data = data;
	}

	public Node<D> getNext() {
		return next;
	}

	public void setNext(Node<D> next) {
		this.next = next;
	}
}
