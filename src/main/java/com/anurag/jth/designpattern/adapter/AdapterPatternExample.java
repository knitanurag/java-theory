package com.anurag.jth.designpattern.adapter;

public class AdapterPatternExample {
	public static void main(String[] args) {
		testClassAdapter();
		testObjectAdapter();
	}

	private static void testObjectAdapter() {
		SocketAdapterImplUsingObject adapter = new SocketAdapterImplUsingObject();
		System.out.println(adapter.get12Volt().getVolt());
		
	}

	private static void testClassAdapter() {
		SocketAdapterImplUsingClasAdapter adapter = new SocketAdapterImplUsingClasAdapter();
		System.out.println(adapter.get12Volt().getVolt());
		
	}
}
