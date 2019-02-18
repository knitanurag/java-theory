package com.anurag.jth.threads;

public class ThreadCreationExample {

	public static void main(String[] args) {
		//ways to create thread.
		//*******1st way**********
		/*
		 ThreadClassExtend t1 = new ThreadClassExtend();
			t1.start();
		*/
		
		//********2nd way***********
		
		/*Thread t2 =  new Thread(new RunnableImplement());
		t2.start();*/
		
		//******3rd way*********
		
		Thread t3 = new Thread(new Runnable() {
			
			public void run() {
				for(int i = 0; i<10; i++) {
					System.out.println("Hello "+i);
				}
				
			}
		});
		
		t3.start();
		
		
		
		
		
	}
	
	
}


class ThreadClassExtend extends Thread{
	@Override
	public void run() {
		for(int i =0; i<10; i++) {
			System.out.println("Hello "+i);
		}
	}
}

class RunnableImplement implements Runnable{

	public void run() {
		for(int i =0; i<10; i++) {
			System.out.println("Hello "+i);
		}
		
	}
	
}