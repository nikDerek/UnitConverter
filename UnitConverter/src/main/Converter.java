package main;

import java.util.Scanner;

public class Converter {


	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int menuSelection = 0; 
		int quantity = 0; 
		boolean isValid = false; 
		
 
		
		
		while (menuSelection != 4) {
			isValid = false; 
			System.out.println("Please select an option"
					+ "\n1. Cups to teaspoon"
					+ "\n2. Miles to kilometers"
					+ "\n3. US gallons to imperial gallons"
					+ "\n4. Quit"); 
			
			menuSelection = in.nextInt();
			
			if(menuSelection == 1) {
				while(isValid == false) {
					System.out.println("How many cups?");
					quantity = in.nextInt();
					if(quantity > 0) {
						System.out.println("Number of cups "+ quantity + " is equal to " + quantity * 48 + " teaspoons\n");
						isValid = true;
					}else {
						System.out.println("Please enter a positive number\n");
						isValid = false;
					}
				}
			}else if(menuSelection == 2) {
				while(isValid == false) {
					System.out.println("How many miles?");
					quantity = in.nextInt();
					if(quantity > 0) {
						System.out.println("Number of miles "+ quantity + " is equal to " + quantity * 1.60934 + " kilometers\n");
						isValid = true;
					}else {
						System.out.println("Please enter a positive number\n");
						isValid = false;
					}
				}
			}else if(menuSelection == 3) {
				while(isValid == false) {
					System.out.println("How many US gallons?");
					quantity = in.nextInt();
					if(quantity > 0) {
						System.out.println("Number of US gallons "+ quantity + " is equal to " + quantity * 0.832674 + " imperial gallons\n");
						isValid = true;
					}else {
						System.out.println("Please enter a positive number\n");
						isValid = false;
					}
				}
			}else {
				System.out.println("Quit");
			}
			
			/*switch (menuSelection) {
				case 1: 
					while(isValid == false) {

						System.out.println("How many Cups"); 
						quantity = in.nextInt();
						if(quantity > 0) {
							System.out.println("Number of cups "+ quantity + " is equal to " + quantity*48+ " teaspoons"); 
							isValid = true; 
						}else {
							System.out.println("Please try a positive number");
							isValid = false; 
						}
							
					}
					break; 
						
				case 2: 
					while(isValid == false) {
						System.out.println("How many Miles"); 
						quantity = in.nextInt(); 
						if(quantity > 0) {
							System.out.println("Number of miles "+ quantity + " is equal to " + quantity*1.60934+ " kilometers");
							isValid = true; 
						}else {
							System.out.println("Please try a positive number");
							isValid = false; 
						}
					
					}
					break;  
				case 3: 
					while(isValid == false) {
						System.out.println("How many US Gallons"); 
						quantity = in.nextInt();  
						if(quantity > 0) {
							System.out.println("Number of US Gallons "+ quantity + " is equal to " + quantity*0.832674+ " Imperial Gallons");
							isValid = true; 
						}else {
							System.out.println("Please try a positive number"); 
							isValid = false;
						}
					
					}
					break; 
				case 4: 
					System.out.println("Quit"); 
					break; 
			
			
			}*/
			
		}
		
	}
			
}
