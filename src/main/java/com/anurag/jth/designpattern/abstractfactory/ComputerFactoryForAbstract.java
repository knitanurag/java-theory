package com.anurag.jth.designpattern.abstractfactory;

import com.anurag.jth.designpattern.factory.Computer;

public class ComputerFactoryForAbstract {

	public static Computer getComputer(ComputerAbstractFactory factory) {
		return factory.createComputer();
	}
	
}
