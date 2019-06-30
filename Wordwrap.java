
/***
 * Class for word wrapping a given String
 * @author Sri Pallavi Atkuri
 *
 */
public class Wordwrap {

	public static void main(String[] args) {

		System.out.println(wrap("Hello Sri. How I am doing? How is everything", 4));

	}

	public static String wrap(String text, int maxLineLength) {

		// checking if the input passed is null or empty. If the input passed is empty/null we are throwing IllegalArgument Exception
		if (text == null || text.equals("")) {
			throw new IllegalArgumentException("String is empty. There is nothing to word wrap");
		}
		// checking if maxLineLength input is <=0. If it is then we are throwing IllegalArgument Exception
		if (maxLineLength <= 0) {

			throw new IllegalArgumentException("invalid LineLength");

		}

		// Splitting the input String on the delimiter 'space' and storing the tokens of strings in String tokens array.
		String[] tokens = text.split("\\s");
		System.out.println(tokens.length);

		// if there is only one Word passed, return the Word
		if (tokens.length == 1) {
			return text;
		}

		// Initializing currentLineLength to 0 and initializing resutingText to "" before iterating the tokens using for loop
		int currentLineLength = 0;
		String resultingText = "";
		for (int currentIndex = 0; currentIndex < tokens.length; currentIndex++) {
			// Adding length of each token + 1 for word space
			currentLineLength += tokens[currentIndex].length() + 1;

			// If currentLineLength is still with in maxLineLength limit then add the token to the existing(current)line
			if (currentLineLength < maxLineLength)

			{
				resultingText += tokens[currentIndex] + " ";

			} else if (tokens[currentIndex].length() >= maxLineLength) {
				// Else if token length is greater than maxLineLength and if it is not the first token then add the token to the nextLine
				if (currentIndex > 0) {
					resultingText += "\n";

				}
				resultingText += tokens[currentIndex] + " ";
				currentLineLength = tokens[currentIndex].length() + 1;
			} else {
				// if the currentLineLength is greater than maxLineLength then add the token to the next Line
				resultingText += "\n";
				resultingText += tokens[currentIndex] + " ";
				currentLineLength = tokens[currentIndex].length() + 1;
			}
		}
		return resultingText;
	}

}
