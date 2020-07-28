package com.arrays;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] a=new int[sc.nextInt()];
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter next no");
			a[i]=sc.nextInt();
		}
    for(int j=0;j<a.length;j++) {
    	System.out.println(a[j]);
    }
		
		
	}
}
