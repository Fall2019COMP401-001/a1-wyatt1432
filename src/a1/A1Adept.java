package a1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		int itemTypes = scan.nextInt();
				
		// Holds the item types
		
		double biggest = -1000;
		double smallest = 1000;
		double grossTotal = 0;
		String firstNameBig = "Hold";
		String lastNameBig = "Hold";
		String firstNameSmall = "Hold";
		String lastNameSmall = "Hold";
		
		String[] itemNames = new String[itemTypes];
		double[] itemPrices = new double[itemTypes];
				
		for (int i = 0; i < itemTypes; i++) {
			itemNames[i] = scan.next();
			itemPrices[i] = scan.nextDouble();
		}
			
		int customerCount = scan.nextInt();
			
		for (int i = 0; i < customerCount; i++) {
			String firstName = scan.next();
			String lastName = scan.next();
			int itemsCount = scan.nextInt();
			double total = 0;
			
			//gets the total number of item types for each customer
			
			for (int j = 0; j < itemsCount; j++) {
				int itemNumber = scan.nextInt();
				String itemName = scan.next();
				
				//goes to each item and identifies the number of those items and the item name
				
				for (int k = 0; k < itemTypes; k++) {
					
					if (itemName.equals(itemNames[k])) {
						total += itemPrices[k] * itemNumber;
						
						//takes the item name, compares it to the master list, and adds
						//the price of that item times the number of that item to the 
						//total if they match
					}
				}
			}
			if (total > biggest) {
				biggest = total;
				firstNameBig = firstName;
				lastNameBig = lastName;
			}
			if (total < smallest) {
				smallest = total;
				firstNameSmall = firstName;
				lastNameSmall = lastName;
			}
			grossTotal += total;
		}
		double average = grossTotal / customerCount;
		DecimalFormat formatter = new DecimalFormat("#0.00");
		System.out.println("Biggest: " + firstNameBig + " " + lastNameBig + " (" + formatter.format(biggest) + ")");
		System.out.println("Smallest: " + firstNameSmall + " " + lastNameSmall + " (" + formatter.format(smallest) + ")");
		System.out.println("Average: " + formatter.format(average));
		scan.close();
	}
}
