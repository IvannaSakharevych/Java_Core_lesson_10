import java.util.Scanner;

/**
 * @author Ivanna Sakharevych
 * @since Java 1.8
 * @version 1.1  29 July 2020
 */

public class CountWords {

	public static void main(String[] args) {

		System.out.println("Введіть речення/текст");
		
		Scanner readSentence = new Scanner(System.in);
		String sentence = readSentence.nextLine();
	    String[] countWords = sentence.split(" ");
	    
	    System.out.println("Кількість слів: "+ countWords.length);
		
	}
	
}
