package com.anurag.jth.designpattern.singleton;

import java.lang.reflect.Constructor;

public class BreakSingletonUsingReflection {
	public static void main(String[] args) {
		EagerSingleton instanceOne = EagerSingleton.getInstance();
		EagerSingleton instanceTwo = null;
		
		try {
			Constructor[] constructors = EagerSingleton.class.getDeclaredConstructors();
			for(Constructor constructor : constructors) {
				constructor.setAccessible(true);
				instanceTwo = (EagerSingleton) constructor.newInstance();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("Instance one"+instanceOne);
		System.out.println("Instance Two"+instanceTwo);
	}
}
