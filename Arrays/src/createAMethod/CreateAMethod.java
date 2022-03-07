package createAMethod;

import java.io.Console;
import java.util.Scanner;

public class CreateAMethod {

	public static void main(String[] args) {
		System.out.println("Type a number between 50 and 300");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		Integer intInput = convertToInt(input);
		System.out.println("The number you typed in was: " + intInput);
	}

	private static Integer convertToInt(String input) {
		Integer intInput = Integer.parseInt(input);
		if (intInput >= 50 && intInput <= 300) {
			return intInput;
		} else {
			return null;
		}		
	}
}
