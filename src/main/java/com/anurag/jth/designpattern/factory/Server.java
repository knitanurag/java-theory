package com.anurag.jth.designpattern.factory;

public class Server extends Computer {

	private String RAM;
	private String HDD;
	private String CPU;
	
	

	public Server(String rAM, String hDD, String cPU) {
		super();
		this.RAM = rAM;
		this.HDD = hDD;
		this.CPU = cPU;
	}

	@Override
	public String getRAM() {
		// TODO Auto-generated method stub
		return RAM;
	}

	@Override
	public String getHDD() {
		// TODO Auto-generated method stub
		return HDD;
	}

	@Override
	public String getCPU() {
		// TODO Auto-generated method stub
		return CPU;
	}

}
