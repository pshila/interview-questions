package com.arrays;

public class EliminateDublicateValue {

	public static void main(String[] args) {
	             int[] a= {3,7,8,9,5,8,7,9,4,3,7,5};
	             for(int i=0;i<a.length;i++){
	            	 int count=0;
	            	 for(int j=i+1;j<a.length;j++) {
	            		 if(a[i]==a[j]) {
	            			 count++;
	            			 break;
	            		 }
	            	 }
	            	if(count==0) {
	            		System.out.print(a[i]+" ");
	            	} 
	            	 
	             }
	}

}
