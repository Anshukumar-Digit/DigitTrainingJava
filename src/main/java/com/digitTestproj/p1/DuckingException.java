package com.digitTestproj.p1;

import java.util.Scanner;

class Operations{
	void fun1() throws Exception {
		Scanner sc = new Scanner(System.in);
  System.out.println("Inside fun-1");
        System.out.println("Division Operation");
        System.out.println("Enter the Numerator");
        int num = sc.nextInt();
        System.out.println("Enter the Denomenator");
        int den = sc.nextInt();
        int res = num/den;

        System.out.println("Division result: "+res);
	 System.out.println("Left fun-1");
	}
	
	void fun2() throws Exception {
	System.out.println("Inside fun-2");
	fun1();
	System.out.println("Left func-2");
	}
	void fun3() {
		try {
			System.out.println("Inside func-3");
			fun2();
		}
		catch(Exception e)
		{
			System.out.println("Exception handled");
		}
		System.out.println("Left fun-3");
	}
	
}
public class DuckingException {
public static void main(String[] args) {
	System.out.println("inside main");
	Operations op=new Operations();
	op.fun3();
}
}
