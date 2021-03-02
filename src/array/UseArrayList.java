package array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UseArrayList {

	public static void main(String[] args) {
		System.out.println("Please enter input limit: ");
		
		int limit = 0;
		Scanner inputSize = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
	    limit = inputSize.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		
		System.out.println("Please enter some numbers: ");
		for(int i=0; i<limit; i++) {
			list.add(sc.nextInt());
		}
		
		for(int i=0; i<list.size(); i++) {
		  System.out.println(list.get(i));
		}
		
		inputSize.close();
        sc.close();
	}

}
