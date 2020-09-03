package Number;

import java.util.ArrayList;

public class Number {
	ArrayList<Integer> nums = new ArrayList<Integer>();
	
	static int sum(ArrayList<Integer> num) {
		int sum = 0;
		for(Integer e : num) {
			sum += e;
		}
		
		return sum;
	}

}
