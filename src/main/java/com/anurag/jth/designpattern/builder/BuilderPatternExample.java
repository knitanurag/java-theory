package com.anurag.jth.designpattern.builder;

public class BuilderPatternExample {
	public static void main(String[] args) {
		Laptop lapy = new Laptop.LaptopBuilder("1","2", "3").setBluetoothEnabled(true).build();
		System.out.println(lapy.isIsbluetoothEnabled());
	}
}
