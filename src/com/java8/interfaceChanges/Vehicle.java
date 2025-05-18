package com.java8.interfaceChanges;


/**Interface Changes made in Java 8
 * 
 * Interface doesnt allow conrete methods
 * Iy default methods will be public abstract
 * If we add new method it will affect implementation classes,So in java 8 they introduced default and static methods
 * we can add default and static methods without affecting implementation classes
 * default method --> for allowing implementation classes to override methods
 * static method  --> for not allowing implementation classes to override methods
 */
public interface Vehicle {
	void wash();
	void price();
	//default method -- can be called by creating object for implementation class
	public default void colour() {
		System.out.println("Red");
	}
	//static method-->can be called using Interface name
	public static int passengers() {
		
		return 4;
	}

}
