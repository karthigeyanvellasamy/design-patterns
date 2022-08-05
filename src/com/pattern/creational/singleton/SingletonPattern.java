package com.pattern.creational.singleton;

/**
 * @author Karthigeyan Vellasamy
 * Singleton Design Pattern
 */
public class SingletonPattern {
	public static void main(String[] args) {

		Singleton instance = Singleton.getInstance();
		Singleton secondInstance = Singleton.getInstance();

		System.out.println(instance);
		System.out.println(secondInstance);
	}
}

class Singleton {

	private static volatile Singleton singleInstance;

	private Singleton() {
	};

	public static Singleton getInstance() {
		if (singleInstance == null) {
			synchronized (Singleton.class) {
				if (singleInstance == null) {
					singleInstance = new Singleton();
				}
			}
		}

		return singleInstance;
	}

}
