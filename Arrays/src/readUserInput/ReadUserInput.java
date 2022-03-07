package readUserInput;

import java.util.Scanner;

public class ReadUserInput {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		Integer intInput = Integer.parseInt(input);
		if (intInput >= 50 && intInput <=300){
			System.out.println("Yes!");
		} else {
			System.out.println("No!");			
		}
	}
}
