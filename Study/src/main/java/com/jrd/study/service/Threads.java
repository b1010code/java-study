package com.jrd.study.service;

public class Threads extends Thread {

	private String name;
	private int seconds;

	public Threads(String name, int seconds) {
		this.name = name;
		this.seconds = seconds;
		start();
	}
	
	public void run() {
		
		System.out.println(name + " " + "Started !");
		
		try {
			for(int i=0; i<6; i++) {
				System.out.println(name + "counter " + i);
				Thread.sleep(seconds);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(name + " " + "Finished the thread !");
		
	}
	
	

}
