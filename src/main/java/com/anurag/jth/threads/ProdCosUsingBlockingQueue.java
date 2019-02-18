package com.anurag.jth.threads;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProdCosUsingBlockingQueue {
	private static BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Runnable() {
			
			public void run() {
				try {
					producer();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			public void run() {
				try {
					consumer();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
		});
		
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}
	
	
	
	private static  void producer() throws InterruptedException {
		Random random = new Random();
		
		while(true) {
			int addValue = random.nextInt(100);
			queue.put(addValue);
			System.out.println("Added ****"+addValue);
		}
		
		
	}
	
	
	private static void consumer() throws InterruptedException {
		Random random = new Random();
		while(true) {
			Thread.sleep(100);
			
			if(random.nextInt(10) == 0) {
				Integer value = queue.take();
				System.out.println("Value taken >>>>>>:"+ value + " New Size is "+queue.size());
			}
			
		}
		
		
	}
	
	
}
