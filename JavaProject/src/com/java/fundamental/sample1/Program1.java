package com.java.fundamental.sample1;

public class Program1 {
	public static void main(String args[]) {
		System.out.println("Hello world");
		Program1 obj=new Program1();
		int result=obj.add(12, 45);
		System.out.println("="+result);
	}
	public int add(int a, int b) {
		int c=a+b;
		System.out.println("addition of "+a+" and "+b+" is");
		return c;
	}
}