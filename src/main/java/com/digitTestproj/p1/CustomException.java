package com.digitTestproj.p1;

import java.util.Scanner;

class Underage extends Exception{
	public String getmsg() {
		return "Your age is below 18,hence you are a kid";
	}
}

class Overage extends Exception{
	public String getmsg() {
		return "Your age is above 60,so have less desires";
	}
}

class Candidate{
	int age;
	void getdata() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age");
		age=sc.nextInt();
		
	}
	
	void verify() throws Exception {
		if(age<18) {
		Underage uae=new Underage();
		System.out.println(uae.getmsg());
		throw uae;
		} 
		else if(age>60) {
		Overage oae=new Overage();
		System.out.println(oae.getmsg());
		}
		else {
		System.out.println("Issue a license");	
		}
	}
}

class RTO{
	void grantLicense(Candidate c) {
		try {
			c.getdata();
			c.verify();
		}
		catch(Exception e) {
			System.out.println("Exception handled");
		}
	}
}

class RTO1{
	void grantLicense(Candidate c) {
		try {
			c.getdata();
			c.verify();
		}
		catch(Exception e1) {
			try {
				c.getdata();
				c.verify();
			}
			catch(Exception e2) {
				try {
					c.getdata();
					c.verify();
				}
				catch(Exception e3) {
					System.out.println("You hav crossed your limit ");
				}
			}
		}
	}
}
public class CustomException {
public static void main(String[] args) {
	Candidate c1=new Candidate();
			RTO r=new RTO();
	r.grantLicense(c1);
	
}
}
