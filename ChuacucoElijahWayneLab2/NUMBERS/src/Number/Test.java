package Number;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(25);
		num.add(230);
		num.add(4095);
		num.add(9565);
		
		System.out.println(Number.sum(num));
	}

}
