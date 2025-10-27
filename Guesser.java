package hello;

import java.util.Scanner;

public class Guesser {

	public static void main(String[] args) {
		TryNumber();
	}
	
	private static void TryNumber() {
		Scanner reader = new Scanner(System.in);
		
		int input = 0;
		int number = (int)(Math.random() * 100);
		int tries = 0;
	
		while(input != number) {
			System.out.println("Input a number from 1 to 100 :");
			input = reader.nextInt();
			
			System.out.println(input + " is " + (input < number ? "smaller." : "greater."));
			
			tries++;
		}
		
		System.out.println("Found in " + tries + " tries.");
		
		System.out.println("Play again ? (Yes/No)");
		String inputStr = reader.nextLine();
		if(inputStr.toLowerCase() == "yes")
			TryNumber();
		
		reader.close();
	}
}
