package numberrangesummarizer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;


public class NumberRangeSummarizerImplementation implements NumberRangeSummarizer  {

	@Override
	public Collection<Integer> collect(String input) {
		return Arrays.stream(input.split(",")).map(Integer::parseInt).collect(Collectors.toList());
	}

	@Override
	public String summarizeCollection(Collection<Integer> input) {
		
		StringBuilder stringBuilder = new StringBuilder();
		List<Integer> listOfNumbers = new ArrayList<>(input);
		
		int start = listOfNumbers.get(0);
		int end = start;
		
		for(int i = 1; i < listOfNumbers.size(); i++) {
			
			int current = listOfNumbers.get(i);
			
			if(current == end + 1) {
				end = current;
			}else {
				
				if(end == start) {
					stringBuilder.append(start);
				}
				else {
					stringBuilder.append(start + "-" + end);
				}
				
				start = current;
				end = current;
				stringBuilder.append(",");
			}
		}
		
		if(end == start) {
			stringBuilder.append(start);
		}
		else {
			stringBuilder.append(start + "-" + end);
		}
		
		return stringBuilder.toString();
	}
}
