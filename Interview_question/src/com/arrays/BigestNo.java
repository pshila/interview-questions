package com.arrays;

public class BigestNo {

	public static void main(String[] args) {
		System.out.println(bigestNo());
		System.out.println(smalesttNo());
		
	}
	public static int bigestNo() {

		  int[] a= {4,56,7,8,3,67,37,8,56,86,35,6};
		  int big=a[0];
		  for(int c:a) {
			  if(big<c) {
				  big=c;
			  }
		  }
     return big;
	
	}
	public static int smalesttNo() {

		  int[] a= {4,56,7,8,3,67,37,8,56,86,35,6};
		  int smal=a[0];
		  for(int c:a) {
			  if(smal>c) {
				  smal=c;
			  }
		  }
   return smal;
	
	}

}
