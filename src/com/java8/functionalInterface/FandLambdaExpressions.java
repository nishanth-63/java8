package com.java8.functionalInterface;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FandLambdaExpressions {
	
	public static void main(String[] args) throws NishanthException {
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		if(i<4) {
			throw new NishanthException();
		}
		
		
		
		
	}

}

class NishanthException extends Exception{
	public NishanthException(){
		super("This is custom Exception");
	}
}
