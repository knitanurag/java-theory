package com.anurag.jth.designpattern.singleton;

public class EagerSingleton {

	private static final EagerSingleton instance = new EagerSingleton();
	
	private EagerSingleton() {
		// TODO Auto-generated constructor stub
	}
	
	public static EagerSingleton getInstance() {
		return instance;
	}
	
	
	
}
