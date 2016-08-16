package pigLatin;

import java.util.Scanner;

public class PigLatinReDo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String userInput = null;
		char charFirst;
		char charSecond;

		System.out.println("Please, enter a word to be translated");
		userInput = sc.nextLine();
		userInput = userInput.toLowerCase();
		

		charFirst = userInput.charAt(0);
		charSecond = userInput.charAt(1);

		if (charFirst == 'a' || charFirst == 'e' || charFirst == 'i' || charFirst == 'o' || charFirst == 'u') {

			System.out.println(userInput + "way");
		} else if (charSecond == 'a' || charSecond == 'e' || charSecond == 'i' || charSecond == 'o'
				|| charSecond == 'u') {
			String deletedChar = userInput.substring(1, userInput.length());

			System.out.println(deletedChar + charFirst + "ay");

		} else {
			String deletedChar2 = userInput.substring(2, userInput.length());
			System.out.println(deletedChar2 + charFirst + charSecond + "ay");
	}

		sc.close();
		
}
}
