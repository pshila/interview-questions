package com.java.programs;

public class StrongNo {

	public static void main(String[] args) {
		int n = 12;
		int fact = 1;
		int sum = 0;
		while (n > 0) {
			int rem = n % 10;

			for (int i = rem; i >= 1; i--) {
				fact *= i;
			}
			sum += fact;
			n = n / 10;
		}
		System.out.println(sum);
	}

}
