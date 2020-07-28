package com.java.programs;

public class DecimalToBinary {
	
	public static int decimalToBinari() {
		int n=34;
		int base=1;
		int res=0;
		while(n>0) {
			int rem=n%2;
			 res=res+rem*base;
			n=n/2;
			base=base*10;
		}
		return res;
		
	}
	public static int BanaryToDecimal() {
		int n=101101;
		int res=0;
		int base=1;
		while (n>0) {
		int	rem=n%10;
		res=res+base*rem;
		n=n/10;
		base=base*2;
		}
		return res;
		
	}

	public static void main(String[] args) {
		 System.out.println(decimalToBinari());
		 System.out.println( BanaryToDecimal());
	}

}
