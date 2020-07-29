import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Ivanna Sakharevych
 * @since Java 1.8
 * @version 1.1  29 July 2020
 */

public class MostCommonWord {

	public static void main(String[] args) {

		System.out.println("Введіть речення/текст");
		
		Scanner readSentence = new Scanner(System.in);
		String sentence = readSentence.nextLine();
	    String[] text = sentence.split(" ");
	    Arrays.sort(text);
		String oftenWord = "";
		String word = "";
		int maxCount = 0;
		int count = 1;

		for (String newWord : text) {
		    if (newWord.equals(word)) {
		        count++;
		    } else {
		        if (count > maxCount) {
		            maxCount = count;
		            oftenWord = word;
		        }
		        word = newWord;
		        count = 1;
		    }
		}

		if (count > maxCount) {
		    oftenWord = word;
		}

		System.out.println("слово яке найчастіше зустрічається в реченні: " + oftenWord);
		
	}
	
}
