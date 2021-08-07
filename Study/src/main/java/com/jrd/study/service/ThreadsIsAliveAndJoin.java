package com.jrd.study.service;

public class ThreadsIsAliveAndJoin implements Runnable  {

	private String name;
	private int seconds;

	public ThreadsIsAliveAndJoin(String name, int seconds) {
		this.name = name;
		this.seconds = seconds;
		Thread thrm = new Thread(this);
		thrm.start();
	}

	@Override
	public void run() {
	}

	public void toJoin(int i) {
		System.out.println(name + " " + "Started !");

		try {
			for (int j = 0; j < 6; j++) {
				System.out.println(name + "counter " + j);
				Thread.sleep(seconds);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(name + " " + "JOIN Finished the Mult thread !");
		
	}

}
