package com.java;

public class Main {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		
		System.out.println("Algorithm Testing Project");
		byte[] data = new byte[10];
		data[0] = 't';
		String test = new String(data, 0, 10);
		System.out.println(test);
		
		long end = System.currentTimeMillis();
		System.out.println((end - start) / 1000.0 + "초");
	}
}
