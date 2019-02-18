package com.anurag.jth.designpattern.singleton;

public class LazyInitializedSingleton {
	private static LazyInitializedSingleton instance;
	private LazyInitializedSingleton() {
		// TODO Auto-generated constructor stub
	}
	
	
	public static LazyInitializedSingleton getInstance() {
		//Here it can destroy the singleton pattern
		if(instance == null) {
			return new LazyInitializedSingleton();
		}
		return instance;
	}
	
	
	
	
	
	
}
