package com.practices;

public class ReverseNumber {

	public static void main(String[] args) {
		int n = 4562356;
		int result = 0;
		while(n>0) {
			int rem = n%10;
			n/=10;
			result =  result *10 + rem;
			}
		System.out.println("reverse number is " + result );
	}

}
