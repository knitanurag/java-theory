package com.anurag.jth.designpattern.factory;

public abstract class Computer {

	public abstract String getRAM();

	public abstract String getHDD();

	public abstract String getCPU();

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return new StringBuilder().append("RAM : " + this.getRAM()).append("HDD: " + this.getHDD())
				.append("CPU" + this.getCPU()).toString();
	}

}
