package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// Your code follows here.
		
		int customerTotal = scan.nextInt();
		
		// Holds the customer total
		
		for (int i = 0; i < customerTotal; i++) {
			String firstName = scan.next();
			char fi = firstName.charAt(0);
			String lastName = scan.next();
			int itemCount = scan.nextInt();
			double total = 0;
			
			// for loop to get the information on each customer
			
			for (int j = 0; j < itemCount; j++) {
				int many = scan.nextInt();
				String name = scan.next();
				// Not needed but I don't know how to skip a token
				double price = scan.nextDouble();
				double totalPrice = price * many;
				total += totalPrice;
			}
			System.out.println(fi + ". " + lastName + ": " + total);
		}
		scan.close();
	}
}
