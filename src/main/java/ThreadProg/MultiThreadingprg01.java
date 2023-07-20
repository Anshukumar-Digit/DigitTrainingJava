package ThreadProg;

import java.util.Scanner;

class Banking extends Thread{
	
public void run() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Banking operations");
	System.out.println("Enter Bank details");
	int accno=sc.nextInt();
	System.out.println("Enter the pin");
	int pin=sc.nextInt();
	System.out.println("Banking started");
 }
}


class Printing extends Thread{
	
public void run() {
	System.out.println("Printing operation");
	for(int i=0;i<5;i++) {
		System.out.println("Hello! Good Morning");
		
	}
	
 }
}

class Addition extends Thread{
	
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
public class MultiThreadingprg01 {
public static void main(String[] args) {
	System.out.println("Main method started");
	Banking b=new Banking();
	//b.run();
	
	Printing p=new Printing();
	//p.run();
	
	Addition add=new Addition();
	//add.run();
	b.start();
	p.start();
	add.start();
	System.out.println("Main terminated");
 }
}
