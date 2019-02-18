package com.anurag.jth.designpattern.factory;

public class ComputerFactory {

	public static Computer getComputer(String type, String rAM, String hDD, String cPU) {
		if(type.equals("PC")) {
			return new PC(rAM, hDD, cPU);
		}else if(type.equals("Server")){
			return new Server(rAM, hDD, cPU);
		}
		return null;
	}
	
	
	
}
