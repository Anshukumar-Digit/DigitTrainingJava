package ThreadProg;

import java.util.Scanner;

class Banking01 implements Runnable{
	
public void run() {
	try (Scanner sc = new Scanner(System.in)) {
		System.out.println("Banking operations");
		System.out.println("Enter Bank details");
		int accno=sc.nextInt();
		System.out.println("Enter the pin");
		int pin=sc.nextInt();
	}
	catch (Exception e) {
		// TODO: handle exception
	}
	System.out.println("Banking started");
 }
}


class printing implements Runnable{
	
public void run() {
	System.out.println("Printing operation");
	for(int i=0;i<5;i++) {
		System.out.println("Hello! Good Morning");
		
	}
	
 }
}

class Addition01 implements Runnable{
	
public void run() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Addition Operations");
	System.out.println("Enter 1st number");
	int num1=sc.nextInt();
	System.out.println("Enter 2nd number");
	int num2=sc.nextInt();
	int res=num1+num2;
	System.out.println("Addition result is"+res);
 }
}
public class RunnableInterface {
public static void main(String[] args) {
	Banking01 b=new Banking01();
	printing p=new printing();
	Addition01 a=new Addition01();
	
	Thread t1=new Thread(b);
	Thread t2=new Thread(p);
	Thread t3=new Thread(a);
	
	t1.start();
	t2.start();
	t3.start();
}
}
