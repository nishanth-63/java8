package com.coreJava;

public class exceptionPractice {
	public static void main(String[] args) {
		try {
		int a=10/0;
		System.out.println(a);
		}
		catch(Exception i) {
			System.out.println(i);
			System.out.println("Hello");
		}
	}

}
