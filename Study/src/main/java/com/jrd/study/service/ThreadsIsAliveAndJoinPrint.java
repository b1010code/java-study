package com.jrd.study.service;

public class ThreadsIsAliveAndJoinPrint {
	public static void main(String[] args) {

		ThreadsIsAliveAndJoin thread1 = new ThreadsIsAliveAndJoin("Mult thread 1", 500);

		ThreadsIsAliveAndJoin thread2 = new ThreadsIsAliveAndJoin("Mult thread 2", 500);

		ThreadsIsAliveAndJoin thread3 = new ThreadsIsAliveAndJoin("Mult thread 3", 500);

		try {
			thread1.toJoin(0);
			thread2.toJoin(0);
			thread3.toJoin(0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("THE PROGRAMMER WAS FINISHED");

	}
}
