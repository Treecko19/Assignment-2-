import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;

import org.junit.jupiter.api.Test;

import WordCount.GUI;
import WordCount.wordcount;

class Wordcounttest {

	//@Test
	//void test() {
		//fail("Not yet implemented");
	//}
	@Test
	void returnwordcountestok() throws FileNotFoundException {
		wordcount WordCount = new wordcount();
		wordcount.main(null);
		//System.out.println(wordcount.returnwordcount().length()) ;
		assert (wordcount.returnwordcount().length()==182) ;
		
		
	}
	@Test
	void returnwordcountestGUI() throws FileNotFoundException {
		GUI gui = new GUI();
		
		assert (gui!= null);
		
		
	}
	@Test
	void returnwordcountestGUI2() throws FileNotFoundException {
		GUI gui = new GUI();
		GUI.main(null);
		assert (gui!= null);
		
		
	}
}
