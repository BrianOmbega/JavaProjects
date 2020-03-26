import java.util.Scanner;
public class WordCounter {

	public static void main(String[] args) {
		//Prompt the user to give input
		System.out.println("Please type in your sentence or paragraph");
		// create a scan object to take in user input
		Scanner scan = new Scanner(System.in);
		//store user input
		String userInput = scan.nextLine();				
		//close the scan object 		
		scan.close();

		//remove trailing and leading space in the string provided by the user.
		userInput = userInput.trim();
		
		int count= 0;
		
		if(userInput.length() == 0) {
		  count = 0;
		}else {
		//split user input on spaces provided.
		String [] splited = userInput.split("\\s+");
		//store the number of words in a variable called count.
	    count = splited.length;	
		}
			
		System.out.println(count);
	}

}
