package classAssignment;

public class Assignment13_StringOperations {

	public static void main(String[] args) {

		String sentence = "Java programming is fun and challenging";

		// Assignment> Count the total number of words in the sentence.
		int count = sentence.length();
		System.out.println("total number of words in the sentence: " + count);

		// Assignment> Print the sentence words in reverse order.
		String reverseOrder = "";
		for (int i = count - 1; i >= 0; i--) {
			reverseOrder = reverseOrder + sentence.charAt(i);
		}
		System.out.println("Reverse order: " + reverseOrder);

		// Assignment> Convert the first character of each word to uppercase and print
		// original sentence

		String[] splittedValues = sentence.split(" ");
		String word1 = splittedValues[0];
		String word2 = splittedValues[1].replaceFirst("p", "P");
		String word3 = splittedValues[2].replaceFirst("i", "I");
		String word4 = splittedValues[3].replaceFirst("f", "F");
		String word5 = splittedValues[4].replaceFirst("a", "A");
		String word6 = splittedValues[5].replaceFirst("c", "C");

		System.out.println(
				"Updated Sentence: " + word1 + " " + word2 + " " + word3 + " " + word4 + " " + word5 + " " + word6);

		System.out.println("\n");

		
		//Assignment> Write a program to search for all occurrences of a “Java” word in the paragraph and print their
		//indexes.
		String paragraph = "Java is a popular programming language. Java is used for web development, mobile applications, and more.";
		
		String[] splittedParagraph = paragraph.split(" ");
		System.out.println("splittedParagraph "+splittedParagraph);
		
	}

}
