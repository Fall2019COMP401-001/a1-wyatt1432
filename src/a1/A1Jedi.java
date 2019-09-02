package a1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int itemTypes = scan.nextInt();
		
		// Holds the item types
		
		String[] itemNames = new String[itemTypes];
		double[] itemPrices = new double[itemTypes];
		int[] itemsPurchased = new int[itemTypes];
		int[] buyerCount = new int[itemTypes];
				
		for (int i = 0; i < itemTypes; i++) {
			itemNames[i] = scan.next();
			itemPrices[i] = scan.nextDouble();
		}
			
		int customerCount = scan.nextInt();
			
		for (int i = 0; i < customerCount; i++) {
			String firstName = scan.next();
			String lastName = scan.next();
			int itemsCount = scan.nextInt();
			
			//gets the total number of item types for each customer
			
			for (int j = 0; j < itemsCount; j++) {
				int itemNumber = scan.nextInt();
				String itemName = scan.next();
				
				//goes to each item and identifies the number of those items and the item name
				
				for (int k = 0; k < itemTypes; k++) {
					
					if (itemName.equals(itemNames[k])) {
						itemsPurchased[k] += itemNumber;
						buyerCount[k] += 1;
						
						//takes the item name, compares it to the master list, and adds
						//the item number to number of items purchased, and also does the
						//the same, but always adding one, to get buyer count
					}
				}
			}
		}
		for (int i = 0; i < itemTypes; i++) {
			if (buyerCount[i] < 1) {
				System.out.println("No customers bought " + itemNames[i]);
			} else {
				System.out.println(buyerCount[i] + " customers bought " + itemsPurchased[i] + " " + itemNames[i]);
			}
		}
		scan.close();
	}
}