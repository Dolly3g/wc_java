import static org.junit.Assert.*;
import org.junit.Test;

public class WCTest{
	@Test
	public void getWordCount_returns_number_of_words_in_given_string(){
		assertEquals(2,WC.getWordCount("Hello World!"));
		assertEquals(5,WC.getWordCount("Its a sunny day outside."));
	}

	@Test
	public void evaluate_returns_number_of_lines_words_and_characters_in_given_string(){
		assertEquals(1,WC.getLineCount("Hello World!\r\nHow are you?"));
		assertEquals(2,WC.getLineCount("Its a sunny day outside.\r\nSee you tommorrow.\r\nBye!"));
	}

	@Test
	public void getLineCount_returns_number_of_lines_in_given_string(){
		int counts[] = {1,5,26};
		int new_counts[] = {2,9,50};
		assertArrayEquals(counts,WC.evaluate("Hello World!\r\nHow are you?"));
		assertArrayEquals(new_counts,WC.evaluate("Its a sunny day outside.\r\nSee you tommorrow.\r\nBye!"));
	}
}