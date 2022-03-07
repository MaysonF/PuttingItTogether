

import static org.junit.Assert.*;
import java.io.InputStream;

import org.junit.Test;

public class fileTester {

	@Test
	public void test() {

		WordCount fileTester = new WordCount();
		InputStream inputstream = this.getClass().getResourceAsStream("Poem.txt");
		assertNotNull(inputstream);
	}
}