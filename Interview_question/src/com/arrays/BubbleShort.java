package com.arrays;

public class BubbleShort {

	public static void main(String[] args) {
		//short the arrays
		int k=0;
		int a[]= {8,5,9,3,7,45,32,43,21,56,34};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
		          if(a[i]>a[j]) {
		        	  int temp=a[i];
		        	  a[i]=a[j];
		        	  a[j]=temp;
		          }
			}
			a[k++]=a[i];
		}
  for(int s:a) {
	  System.out.println(s+"  ");
  }
		
		
		
	}
}
