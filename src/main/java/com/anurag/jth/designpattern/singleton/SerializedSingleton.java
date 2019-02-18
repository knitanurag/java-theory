package com.anurag.jth.designpattern.singleton;

import java.io.Serializable;

public class SerializedSingleton implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private SerializedSingleton() {
		// TODO Auto-generated constructor stub
	}
	
	private static class SingletonHelper{
		public static final SerializedSingleton instancce = new SerializedSingleton();
	}

	public static SerializedSingleton getInstance() {
		return SingletonHelper.instancce;
	}
	
	/**
	 * This method prevents breaking of singleton while serialization.
	 * @return
	 */
	protected Object readResolve() {
		return getInstance();
		
	}
	
}
