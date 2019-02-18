package com.anurag.jth.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExample {
	public static void main(String[] args) throws InterruptedException {
		
		ExecutorService executor = Executors.newFixedThreadPool(2);
		
		for(int i=0;i<2;i++) {
			executor.submit(new Processor(i));
		}
		//No New task will be accepted after this.
		executor.shutdown();
		System.out.println("All task submitted.");
		
		executor.awaitTermination(1, TimeUnit.DAYS);
	}
}


class Processor implements Runnable{
	
	private int id;
	
	public Processor(int id ) {
		this.id  = id;
		// TODO Auto-generated constructor stub
	}

	public void run() {
		System.out.println("Strting "+id);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Completed "+id);
		
	}
}
