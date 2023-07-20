package com.digit.JavaTraining.ProducerConsumer.com;

public class producer extends Thread {
 Queue a;
  public producer(Queue q) {
	 a=q;
 }
 
	public void run() {
		int i=0;
		while(true) {
			a.put(i++);
		}
	}
}
