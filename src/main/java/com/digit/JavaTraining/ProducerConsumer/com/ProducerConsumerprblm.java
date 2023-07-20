package com.digit.JavaTraining.ProducerConsumer.com;

import java.util.ServiceLoader.Provider;

public class ProducerConsumerprblm {
public static void main(String[] args) {
	Queue q = new Queue();
	producer p=new producer(q);
	Consumer c=new Consumer(q);
	
	p.start();
	c.start();
	
}
}
