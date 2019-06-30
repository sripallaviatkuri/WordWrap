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
}
