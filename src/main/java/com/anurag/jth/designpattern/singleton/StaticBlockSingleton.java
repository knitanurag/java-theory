package com.anurag.jth.designpattern.singleton;

public class StaticBlockSingleton {
	private static StaticBlockSingleton instance;
	
	private StaticBlockSingleton() {
		
	}
	
	static {
		try {
			instance = new StaticBlockSingleton();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	public static StaticBlockSingleton getInstance() {
		return instance;
	}
	
	
}
