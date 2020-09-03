package DATESSS;
import java.util.*;
public class Test {

	public static void main(String[] args) {
		ArrayList<Date> date = new ArrayList<Date>();
		date.add(new Date(4,12,2001));
		date.add(new Date(4,15,2000));
		date.add(new Date(1,1,2020));
		
		Collections.sort(date);
		for(int i = 0; i < date.size(); i++) {
			System.out.println(date.get(i).month + " " + date.get(i).day + " " + date.get(i).year);
		}

	}

}
