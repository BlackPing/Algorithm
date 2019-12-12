package com.java;

import java.util.LinkedList;

import com.java.Algorithm.SingleLinkedList;
import com.java.Algorithm.StringPressure;

public class Main {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		
		System.out.println("Algorithm Testing Project");
		
		// LinkedList
//		SingleLinkedList<Integer> Linked = new SingleLinkedList<Integer>();
//		
//		LinkedList<?> node;
//		//  7 10 15 5 8
//		Integer data = 15;
//		Linked.addFirst(data);
//		data = 10;
//		Linked.addFirst(data);
//		data = 5;
//		Linked.addLast(data);
//		data = 7;
//		Linked.addFirst(data);
//		data = 8;
//		Linked.addLast(data);
//		Linked.print();
//		
//		Linked.allPrint();
//		Linked.removeFirst();
//		System.out.println(Linked.size());
//		
//		System.out.println(Linked.remove(3).getData());
		
		//StringPressure
		StringPressure sol = new StringPressure();
		sol.solution("ababcdcdababcdcd");
		
		long end = System.currentTimeMillis();
		System.out.println((end - start) / 1000.0 + "초");
	}
}
