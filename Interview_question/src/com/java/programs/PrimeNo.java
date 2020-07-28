package com.java.programs;

public class PrimeNo {
	public static void main(String[] org) {
		//int n=5;
		for (int n=2;n<200;n++) {
		int count = 0;
		for(int i=2; i<=n/2;i++) {
			if(n%i==0) {
				//System.out.println("not a prime no."+n);
				count++;
				break;
			}
		}
		if(count==0) {
			System.out.print(n+"  ");
		}
	}
	}
}
