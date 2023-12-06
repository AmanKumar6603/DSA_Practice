package com.practices;

import java.util.Scanner;

public class Switchcase {

	public static void main(String[] args) {
		//switch case 
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the fruit name");
		String fruit = in.next();
		
//		switch(fruit) {
//		
//		case "Mango":
//			System.out.println("King of fruit");
//			break;
//		case "banana":
//			System.out.println("Banan is Yello in color ");
//			break;
//		case "pineapple":
//			System.out.println("citrius fruit");
//			break;
//		case "Apple":
//			System.out.println("Apple is red and sweet");
//			break;
//		default:
//			System.out.println("All are my favourite fruit");
//	
//		}
		
		switch(fruit) {
		case "Mango" -> System.out.println("King of fruit");
		case "banana" -> System.out.println("Banan is Yello in color ");
		case "pineapple" -> System.out.println("citrius fruit");
		case "Apple" -> System.out.println("Apple is red and sweet");
		default -> System.out.println("All are my favourite fruit");
		}
	}

}
