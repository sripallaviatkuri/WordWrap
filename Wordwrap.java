
/***
 * Class for word wrapping a given String
 * 
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

}
