package com.anurag.jth.designpattern.singleton;

public class BillPughSingleton {
	private BillPughSingleton() {
		// TODO Auto-generated constructor stub
	}
	
	public static class SingletonHelper{
		public static final BillPughSingleton INSTANCE = new  BillPughSingleton();
		
	}
	
	
	/**
	 * Class will not be loaded in the memory till someone calls getInstace method
	 * @return
	 */
	public static BillPughSingleton getInstance() {
		return SingletonHelper.INSTANCE;
	}
	
	
	
	
}
