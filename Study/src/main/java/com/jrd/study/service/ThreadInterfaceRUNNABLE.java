package com.jrd.study.service;

public class ThreadInterfaceRUNNABLE implements Runnable {

	private String name;
	private int seconds;

	public ThreadInterfaceRUNNABLE(String name, int seconds) {
		this.name = name;
		this.seconds = seconds;
		Thread thr = new Thread(this);
		thr.start();
	}

	@Override
	public void run() {
		
		System.out.println(name + " " + "Started !");

		try {
			for (int i = 0; i < 6; i++) {
				System.out.println(name + "counter " + i);
				Thread.sleep(seconds);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(name + " " + "Finished the thread !");

	}

}
