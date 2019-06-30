
/***
 * Class for word wrapping a given String
 * 
 * @author Sri Pallavi Atkuri
 *
 */
public class Wordwrap {

	public static void main(String[] args) {

	}
	public static String wrap(String text, int maxLineLength) {

		// checking if the input passed is null or empty. If the input passed is empty/null we are throwing IllegalArgument Exception
		if (text == null || text.equals("")) {
			throw new IllegalArgumentException("String is empty. There is nothing to word wrap");
		}
}
