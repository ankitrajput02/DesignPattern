package com.bridgelabz.creationaldesign.singleton;

/**
 * Title:Thread Safe Singleton. To create a thread-safe singleton class is to
 * make the global access method synchronized. Created By:Ankit Rajput
 * 
 *
 */
public class ThreadSafeSingleton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Counter c = new Counter();
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				for (int i = 1; i <= 1000; i++) {
					c.increment();
				}
			}
		});
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				for (int i = 1; i <= 1000; i++) {
					c.increment();
				}
			}
		});
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("Count " + c.count);
	}

}

//synchronized
class Counter {
	int count;

	public synchronized void increment() {
		count++;
	}
}
