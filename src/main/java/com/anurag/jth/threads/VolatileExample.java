package com.anurag.jth.threads;

import java.util.Scanner;

/**
 * @author a0754971
 * Volatle prevents thread caching.
 */
public class VolatileExample {
	public static void main(String[] args) {
		VolatileThread v1 = new VolatileThread();
		Thread t1 = new Thread(v1);
		t1.start();
		System.out.println("Press Back button to stop.");
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		v1.shutdown();
	}
}

class VolatileThread implements Runnable{
	private volatile boolean running = true;

	public void run() {
		while(running) {
			
			try {
				System.out.println("Hello :::");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	
	public void shutdown() {
		running = false;
	}
	
	
	
	
	
	
}
