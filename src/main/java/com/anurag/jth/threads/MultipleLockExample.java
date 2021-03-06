package com.anurag.jth.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MultipleLockExample {
	public static void main(String[] args) {
		final Worker worker = new Worker();
		System.out.println("Starting");
		long start = System.currentTimeMillis();
		Thread t1  =new Thread(new Runnable() {
			
			public void run() {
				worker.process();
				
			}
		});
		t1.start();
		Thread t2  =new Thread(new Runnable() {
			
			public void run() {
				worker.process();
				
			}
		});
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		long end = System.currentTimeMillis();
		
		
		System.out.println("Time taken "+(end - start));
		
		System.out.println("List1 : "+worker.getList1().size()+ "    List2 :"+worker.getList2().size());
		
	}
}



class Worker{
	
	private Object lock1 = new Object();
	private Object lock2 = new Object();
	
	private List<Integer> list1 = new ArrayList<Integer>();

	private List<Integer> list2 = new ArrayList<Integer>();
	
	
	
	public  void stageOne() {
		synchronized (lock1) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			list1.add(new Random().nextInt(100));
			
		}
	}
	
	public  void stageTwo() {
		synchronized(lock2) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			list2.add(new Random().nextInt(100));
			
		}
	}
	
	
	public void process() {
		for (int i = 0; i < 1000; i++) {
			stageOne();
			stageTwo();
		}
	}
	
	
	public List<Integer> getList1() {
		return list1;
	}

	public void setList1(List<Integer> list1) {
		this.list1 = list1;
	}

	public List<Integer> getList2() {
		return list2;
	}

	public void setList2(List<Integer> list2) {
		this.list2 = list2;
	}
}
