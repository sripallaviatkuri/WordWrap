import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class WordwrapTest {
	// Invalid input tests
	@Test
	void testEmptyText() {

		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> Wordwrap.wrap("", 0));
		assertEquals("String is empty. There is nothing to word wrap", exception.getMessage());
	}

	@Test
	void testNullText() {
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> Wordwrap.wrap(null, 0));
		assertEquals("String is empty. There is nothing to word wrap", exception.getMessage());
	}

	@Test
	void testZeroMaxLineLengthException() {

		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
				() -> Wordwrap.wrap("hello", 0));
		assertEquals("invalid LineLength", exception.getMessage());

	}

	@Test
	void testNegativeMaxLineLengthException() {
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
				() -> Wordwrap.wrap("hello", 0));
		assertEquals("invalid LineLength", exception.getMessage());
	}

	// Tests with positive test cases
	@Test
	void testTextWithOneWord() {
		assertEquals("hello", Wordwrap.wrap("hello", 12));
	}

	@Test
	void testForWordLengthGreaterThanMaxLength() {
		assertEquals("hello \nsri ", Wordwrap.wrap("hello sri", 4));
	}

	@Test
	void testTextWithSpecialCharacters() {
		assertEquals("hi \nsri! ", Wordwrap.wrap("hi sri!", 4));
	}

	@Test
	void testTextWithMultipleWords() {
		assertEquals("Hello \nSri. \nHow \nare \nyou \ndoing? \nHow \nis \neverything ",
				Wordwrap.wrap("Hello Sri. How are you doing? How is everything", 4));
	}

	@Test
	void testSingleWordLengthGreaterThanMaxLength() {
		assertEquals("HelloHowAreYou", Wordwrap.wrap("HelloHowAreYou", 4));

	}
}
