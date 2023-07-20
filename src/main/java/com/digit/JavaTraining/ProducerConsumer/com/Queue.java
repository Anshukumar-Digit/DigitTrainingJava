package com.digit.JavaTraining.ProducerConsumer.com;

public class Queue {
int x=0;

public void get() {
	// TODO Auto-generated method stub
	System.out.println("Consumer has comsumed the value"+x);
	
}

public void put(int i) {
	// TODO Auto-generated method stub
	x=i;
	System.out.println("Producer has produced the value"+x);
}

}
