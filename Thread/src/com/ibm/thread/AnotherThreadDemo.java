package com.ibm.thread;

public class AnotherThreadDemo implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("in another thread"+Thread.current());
		
	}

}
