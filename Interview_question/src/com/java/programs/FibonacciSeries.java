package com.java.programs;

public class FibonacciSeries {

	public static void main(String[] args) {
		int a=5,b=8;
		int n=12,c=0;
		for(int i=1;i<=n;i++) {
			c=a+b;
			System.out.print(c+"  ");
			a=b;
			b=c;
			
		}
	

	}

}
