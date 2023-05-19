package numberrangesummarizer;

import static org.junit.Assert.*;

import org.junit.Test;

public class SummarizeCollectiontest {

	@Test
	public void test() {
		
		NumberRangeSummarizerImplementation obj = new NumberRangeSummarizerImplementation();
		String result = obj.summarizeCollection(obj.collect("1,3,6,7,8,12,13,14,15,21,22,23,24,31"));  
		String expected = "1,3,6-8,12-15,21-24,31";
		
		assertEquals(expected, result);
	}

}
