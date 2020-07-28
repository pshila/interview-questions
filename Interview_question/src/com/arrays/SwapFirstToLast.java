package com.arrays;

public class SwapFirstToLast {

	public static void main(String[] args) {
                int[] a= {3,6,4,7,9,64,8,6,4,9};
                int temp=a[0];
                a[0]=a[a.length-1];
                a[a.length-1]=temp;
                for(int k:a) {
                	System.out.print(k+"  ");
                }
                

	}

}
