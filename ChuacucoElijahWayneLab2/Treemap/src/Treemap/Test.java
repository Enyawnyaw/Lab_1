package Treemap;
import java.util.*;

public class Test {

	public static void main(String[] args) {
		Date d1 = new Date(9, 10, 2002);
		Date d2 = new Date(8, 20, 2020);
		Date d3 = new Date(4, 16, 2005);
		Date d4 = new Date(3, 24, 2010);
		
		

		TreeMap<Date, String> syllabus = new TreeMap(); // use compare to as basis
		syllabus.put(d1, "java");
		syllabus.put(d2, "python");
		syllabus.put(d3, "c++");
		syllabus.put(d4, "java Script");
		
		 for (Map.Entry<Date, String> topic: syllabus.entrySet()) {
			if(topic.getKey().getMonth() == 9 && topic.getKey().getYear() == 2002) {
				System.out.println(topic.getValue());
			}else {
				System.out.println(topic.getValue() + " does not fall in September 2001");
			}
		} 

	

	}

}