package com.anurag.jth.designpattern.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class BreakSerializedSingleton implements Serializable{

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		SerializedSingleton instanceOne = SerializedSingleton.getInstance();
		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("filename.ser"));
		out.writeObject(instanceOne);
		out.close();
		
		
		ObjectInput in = new ObjectInputStream(new FileInputStream("filename.ser"));
		SerializedSingleton instanceTwo = (SerializedSingleton) in.readObject();
		in.close();
		
		
		System.out.println("inastance One "+instanceOne);
		System.out.println("instance Two "+instanceTwo);
	}
}
