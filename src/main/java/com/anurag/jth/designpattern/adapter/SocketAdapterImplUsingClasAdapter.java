package com.anurag.jth.designpattern.adapter;

public class SocketAdapterImplUsingClasAdapter extends Socket implements SocketAdapter {

	@Override
	public Volt get120Volt() {
		return getVolt();
	}

	@Override
	public Volt get3Volt() {
		return convertVolt(getVolt(), 40);
	}

	@Override
	public Volt get12Volt() {
		return convertVolt(getVolt(), 10);
	}
	
	
	private Volt convertVolt(Volt volt, int i) {
		return new Volt(volt.getVolt()/i);
	}
	
	
	

}
