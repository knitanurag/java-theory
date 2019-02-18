package com.anurag.jth.designpattern.factory;

public class TestFactoryPattern {
	public static void main(String[] args) {
		Computer computer = ComputerFactory.getComputer("PC", "1", "2","3");
		Computer computer2 = ComputerFactory.getComputer("Server", "4", "5", "6");
		System.out.println(computer);
		System.out.println(computer2);
	}
}
