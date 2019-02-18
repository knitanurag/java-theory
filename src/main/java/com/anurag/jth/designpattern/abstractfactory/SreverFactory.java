package com.anurag.jth.designpattern.abstractfactory;

import com.anurag.jth.designpattern.factory.Computer;
import com.anurag.jth.designpattern.factory.Server;

public class SreverFactory implements ComputerAbstractFactory{
	
	private String ram;
	private String hdd;
	private String cpu;
	
	public SreverFactory(String ram, String hdd, String cpu) {
		super();
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}

	@Override
	public Computer createComputer() {
		return new Server(ram, hdd, cpu);
	}
 
}
