package com.anurag.jth.designpattern.singleton;

public class ThreadSafeSingleton {
	private static ThreadSafeSingleton instance;
	
	public ThreadSafeSingleton() {
		// TODO Auto-generated constructor stub
	}
	
	public static synchronized ThreadSafeSingleton getInstance() {
		if(instance == null) {
			instance = new ThreadSafeSingleton();
		}
		return instance;
	}
	
	
	//Double check synchronized method to improve performance
	public static ThreadSafeSingleton getDoubleCheckInstance() {
		if(instance == null) {
			synchronized (ThreadSafeSingleton.class) {
				if(instance == null) {
					instance = new ThreadSafeSingleton();
				}
			}
		}
		return instance;
	}
	
	
}
