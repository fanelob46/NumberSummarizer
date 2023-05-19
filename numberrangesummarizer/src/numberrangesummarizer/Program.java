package numberrangesummarizer;

public class Program {
	
	public static void main(String args[]) {
		
		NumberRangeSummarizerImplementation obj = new NumberRangeSummarizerImplementation();
		try {
			String result = obj.summarizeCollection(obj.collect("1,3,6,7,8,12,13,14,15,21,22,23,24,31"));
			System.out.print(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}


