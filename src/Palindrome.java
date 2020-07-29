import java.util.Scanner;

/**
 * @author Ivanna Sakharevych
 * @since Java 1.8
 * @version 1.1 28 July 2020
 */

public class Palindrome {

	public static void main(String[] args) {

		System.out.println("������ ����� �� 5 ����");
		
		Scanner readWord = new Scanner(System.in);
		String word = readWord.next();

		if (word.length() == 5) {

			String reverseWord = new StringBuffer(word).reverse().toString();

			if (word.equalsIgnoreCase(reverseWord)) {
				System.out.println(word + ", � ����������");
			} else {
				System.out.println(word + ", �� � ����������");
			}
			
		} else {
			System.out.println("�� ����� �� � 5 ����!");
		}

	}

}
