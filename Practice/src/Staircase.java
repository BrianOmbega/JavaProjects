import java.util.Scanner;

public class Staircase {

	public static void main(String[] args) {
		//create an instant of the scanner object.
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the number of steps you desire: ");
		int numSteps = scan.nextInt();
		System.out.println("Please enter the width you want each step to have:");
		int stepWidth = scan.nextInt();
		for(int i = 0; i < numSteps ; i++ ) {
			for(int j = 0; j < (i + 1) * stepWidth; j++ ) {
				System.out.print("*");
			}
			//go to the next line
			System.out.println();
		}

	}

}
