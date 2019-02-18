package com.anurag.jth.threads;

import java.util.Scanner;

public class WaitNotifyExample {
	public static void main(String[] args) {
		final Processor1 p = new Processor1();
		Thread t1= 	new Thread(new Runnable() {
			
			public void run() {
				try {
					p.produce();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
		});
		 
		
		Thread t2 = new Thread(new Runnable() {
			
			public void run() {
				try {
					p.consume();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
		});		t1.start();
		t2.start();
		
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
}


class Processor1{
	
	public void produce() throws InterruptedException {
		synchronized (this) {
			System.out.println("Producer is running.");
			wait();
			System.out.println("Resumed");
		}
	}
	
	public void consume() throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		Thread.sleep(2000);
		synchronized (this) {
			System.out.println("Waiting for return key");
			sc.nextLine();
			System.out.println("return key pressed.");
			notify();
		}
		
	}
	
}