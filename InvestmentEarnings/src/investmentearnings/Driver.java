package investmentearnings;

//import the scanner object to allow user input
import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//prompt the user to enter a buying price
		System.out.println("Please enter your buying price per share: ");
		// store the buying price in a variable
		double buyingPrice = scan.nextDouble();
		//trigger the while loop by setting closingPrice as a positive number
		double closingPrice = 0.1;
		//keep track of the number of days since the user entered the buying price
		int day = 1;
		
		while(true) {
			System.out.println("Please enter the closing price after day " + day + "(value must be positive)");
			closingPrice = scan.nextDouble();
			if(closingPrice < 0.0) break;
			double earnings = closingPrice - buyingPrice;
			
			if(earnings > 0) {
				System.out.println("After day " + day + " you earned " + earnings + " per share from your original buying price.");				
			}
			else if(earnings < 0) {
				System.out.println("After day "+ day + " you lost " + (-earnings) + " per share from your original buying price.");
			}
			else {
				System.out.println("After day " + day +" you have no earnings per share from your original buying price.");
			}
			System.out.println("Thank you for trading with us.");
			day++;
		}
		scan.close();
	}

}
