package com.anurag.jth.designpattern.builder;

public class Laptop {
	private String hdd;
	private String ram;
	private String cpu;
	private boolean isbluetoothEnabled;
	private boolean isGraphicsCardEnabled;
	
	public String getHdd() {
		return hdd;
	}

	public String getRam() {
		return ram;
	}

	public String getCpu() {
		return cpu;
	}

	public boolean isIsbluetoothEnabled() {
		return isbluetoothEnabled;
	}

	public boolean isGraphicsCardEnabled() {
		return isGraphicsCardEnabled;
	}

	private Laptop(LaptopBuilder builder) {
		this.hdd = builder.hdd;
		this.ram = builder.ram;
		this.cpu = builder.cpu;
		this.isbluetoothEnabled = builder.isbluetoothEnabled;
		this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
	}

	public static class LaptopBuilder{
		private String hdd;
		private String ram;
		private String cpu;
		private boolean isbluetoothEnabled;
		private boolean isGraphicsCardEnabled;
		
		public LaptopBuilder(String hdd, String ram, String cpu) {
			super();
			this.hdd = hdd;
			this.ram = ram;
			this.cpu = cpu;
		}
		
		
		public LaptopBuilder setGraphoicsCardEnabled(boolean isGraphicsCardEnabled) {
			this.isGraphicsCardEnabled = isGraphicsCardEnabled;
			return this;
			
		}
		
		public LaptopBuilder setBluetoothEnabled(boolean isbluetoothEnabled) {
			this.isbluetoothEnabled = isbluetoothEnabled;
			return this;
			
		}

		
		public Laptop build() {
			return new Laptop(this);
		}
		
		
	}
	
	
}
