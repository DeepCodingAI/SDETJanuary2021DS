package linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class UseLinkedList {

	public static void main(String[] args) {
		List<String> cityList = new LinkedList<String>();
		cityList.add("NY");
		cityList.add("PA");
		cityList.add("NJ");
		
		Iterator it = cityList.listIterator();
		while(it.hasNext()) {
		 System.out.println(it.next());
		}

	}

}
