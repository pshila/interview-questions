package com.arrays;

public class SecondBigestNo {

	public static void main(String[] args) {
		 int[] a= {5,4,7,4,8,56,4,77,8,5,455,7,46,3,6,2,8,90};
		 int big=a[0];
		 int sec=0;
		 int third=0;
		 for(int c:a) {
			 if(big<c) {
				 third=sec;
				 sec=big;
				 big=c;
			 }
			 else if(sec<c) 
			  { 
				 third=sec;
				 sec=c;
			  }
		 }
		
		 
		 System.out.println(third+" ");
		 System.out.println(sec+" ");
		 System.out.println(big+" ");
	}

}
