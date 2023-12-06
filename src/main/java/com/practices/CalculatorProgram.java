package com.practices;

import java.util.Scanner;

public class CalculatorProgram {

	public static void main(String[] args) {
		System.out.println("Enter the operations:- Add, Sub, mul, div ");
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter the operation +, -,%, *, /");
			System.out.println("enter 'n' to exit");
			//take the operation
			char ops = input.next().trim().charAt(0);
			long result = 0;
			
			if (ops == '*' || ops == '+' || ops == '-' || ops == '/' || ops == '%') {
					
				// input two number 
				System.out.println("Enter two numbers ");
				int num1 = input.nextInt();
				int num2 = input.nextInt();
					
				if (ops == '*') {

					result = num1 * num2;
					System.out.println("Multiplication is : " + result);
				}
				if (ops == '+') {

					result = num1 + num2;
					System.out.println("Addition is : " + result);
				}
				if (ops == '-') {

					result = num1 - num2;
					System.out.println("Subtraction is : " + result);
				}
				if (ops == '/') {

					Integer results = num1 / num2;
					System.out.println("Division is : " + results.floatValue());
				}
				if (ops == '%') {

					result = num1 % num2;
					System.out.println("Modulus is : " + result);
				} 
			}else if(ops == 'n' || ops == 'N') {
				break;
			}else {
				System.out.println("Invalid Operation");
			}
            
            
		}
		
	}

}
