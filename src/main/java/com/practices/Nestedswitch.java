package com.practices;

import java.util.Scanner;

public class Nestedswitch {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the name of a person ");
		String name = in.next();
		
		System.out.println("Enter the address of the person");
		String address = in.next();
		
		switch(name) {
		
		case "aman": 
			System.out.println("The person is so cool");
			
		case "annu":
			System.out.println("The person is so trustworthy");
			
//		case "anmol":
//			System.out.println("Anmol is a intellegent boy");
//			
//		case "akash":
//			System.out.println("Akash is a clever boy");
			
		
			System.out.println("Address is : ");
			switch(address) {
			
			case "punjab":
				System.out.println("he lives in Punjab");
				break;
			case "Amritsar":
				System.out.println("She lives in Amritsar");
				break;
			case "Gorakhpur":
				System.out.println("He lives in Gorakhpur");
				break;
			default:
				System.out.println("I don't know his/her address");
			}
			break;
		default:
			System.out.println("This person is not in our list");
		}

	}

}
