package com.java.programs;

public class PerfectNo {
  public static void main(String org[]) {
	     int n=28;
	     int sum = 0;
	     for(int i=1;i<=n/2;i++) {
	    	 if(n%i==0) {
	    		 sum+=i;
	    	 }
	    	 
	     }
	  if(n==sum)
	  {
		  System.out.println(n+"n is perfect no.");
	  }
	  else 
		  System.out.println("not a perfect no.");
  }
}
