package com.arrays;

public class MissingNo {

	public static void main(String[] args) {
		// missing no. between 1 to 100
		int a[]= {6,34,3,4,66,44,33,65,75,45};
		
		
		for(int i=1;i<=100;i++) {
			int count=0;
			for(int m:a) {
				if(m==i) {
					count++;
					break;
				}
			}
			if (count==0) {
				System.out.println(i);
		}
		
		}

	}
}
