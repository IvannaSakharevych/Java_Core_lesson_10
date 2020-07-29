import java.util.Scanner;

/**
 * @author Ivanna Sakharevych
 * @since Java 1.8
 * @version 1.1 28 July 2020
 */

public class Palindrome {

	public static void main(String[] args) {

		System.out.println("Введіть слово із 5 літер");
		
		Scanner readWord = new Scanner(System.in);
		String word = readWord.next();

		if (word.length() == 5) {

			String reverseWord = new StringBuffer(word).reverse().toString();

			if (word.equalsIgnoreCase(reverseWord)) {
				System.out.println(word + ", є паліндромом");
			} else {
				System.out.println(word + ", НЕ є паліндромом");
			}
			
		} else {
			System.out.println("Це слово НЕ з 5 літер!");
		}

	}

}
