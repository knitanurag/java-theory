package com.anurag.jth.threads;

import java.util.LinkedList;
import java.util.Random;

/**
 * @author a0754971
 *
 */
public class ProdConsUsingWaitAndNotify {
	public static void main(String[] args) {
		final Processor2 processor2 = new Processor2();
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				try {
					processor2.produce();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {

			public void run() {
				try {
					processor2.consume();
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
}

/**
 * @author a0754971
 *
 */
class Processor2 {
	private LinkedList<Integer> list = new LinkedList();
	private final int LIMIT = 10;
	private Object lock = new Object();

	/**
	 * producer.
	 * 
	 * @throws InterruptedException
	 */
	public void produce() throws InterruptedException {
		int value = 0;
		while (true) {

			synchronized (lock) {
				if (list.size() == LIMIT) {
					System.out.println("List is full going to wait.");
					lock.wait();
				}
				System.out.println("Adding value to the list"+value+" list size is "+list.size());	
				list.add(value++);
				lock.notify();
			}

		}

	}

	/**
	 * Consumer.
	 * 
	 * @throws InterruptedException
	 */
	public void consume() throws InterruptedException {

		while (true) {
			synchronized (lock) {
				if (list.isEmpty()) {
					System.out.println("List is empty going to wait.");
					lock.wait();
				}

				int removedValue = list.removeFirst();
				System.out.println("Removed value is :" + removedValue + " and list size is :" + list.size());
				lock.notify();
			}
			Thread.sleep(new Random().nextInt(1000));
		}

	}

};