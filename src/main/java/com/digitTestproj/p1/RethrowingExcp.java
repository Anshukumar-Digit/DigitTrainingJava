package com.digitTestproj.p1;

import java.util.Scanner;

class Operation{
	void fun1() {
		try {
			System.out.println("Inside fun-1");
			Scanner sc=new Scanner(System.in);
			System.out.println("Divison operator");
			System.out.println("Enter the Numerator:");
			int num=sc.nextInt();
			System.out.println("Enter the denominator:");
			int den=sc.nextInt();
			
			int res=num/den;
			System.out.println("Divison result is:"+res);
		}
		catch(Exception e) {
			System.out.println("Exception handled in fun-1");
			throw e;
		}
		finally {
			System.out.println("Left fun-1");
		}
	}
}
public class RethrowingExcp {
public static void main(String[] args) {
	try {
		System.out.println("Inside main");
		Operation op=new Operation();
		op.fun1();
	}
	catch(Exception e) {
		System.out.println("Exception handled in main method");
	}
}
}
