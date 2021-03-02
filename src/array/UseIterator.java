package array;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class UseIterator {

	public static void main(String[] args) {
		List<String> cityList = new ArrayList<String>();
		cityList.add("NY");
		cityList.add("PA");
		cityList.add("FL");
		cityList.add("AZ");
		cityList.add("CA");
		
		System.out.println("Using Iterator & While loop");
		ListIterator<String> it = cityList.listIterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	
		System.out.println("Using for each loop");
		for(String city:cityList) {
			System.out.println(city);
		}
	
		System.out.println("Using for loop");
		for(int i=0; i<cityList.size(); i++) {
			System.out.println(cityList.get(i));
		} 
		

	}

}
