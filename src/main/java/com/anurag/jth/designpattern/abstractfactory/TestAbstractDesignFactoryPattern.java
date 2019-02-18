package com.anurag.jth.designpattern.abstractfactory;

import com.anurag.jth.designpattern.factory.Computer;

public class TestAbstractDesignFactoryPattern {
	public static void main(String[] args) {
		
		Computer pc = ComputerFactoryForAbstract.getComputer(new PCFactory("1","2", "3"));
		Computer server = ComputerFactoryForAbstract.getComputer(new SreverFactory("4", "5", "6"));
		
		System.out.println("PC "+pc);
		System.out.println("Server"+server);
		
		
		
	}
}
