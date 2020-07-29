import java.util.Scanner;

/**
 * @author Ivanna Sakharevych
 * @since Java 1.8
 * @version 1.1 28 July 2020
 */

public class ChangeVowels {
	
	public static void main(String[] args) {

		System.out.println("¬вед≥ть реченн€/текст");
		
		Scanner readSentence = new Scanner(System.in);
		String sentence = readSentence.nextLine();

		System.out.println(sentence.replaceAll("[ја≈е»и≤≥ќо”у]", "-"));
		
	}
}
