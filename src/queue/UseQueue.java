package queue;

import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		queue.add("Peter");
		queue.add("James");
		queue.add("Dan");
		queue.add("Johan");
		queue.add("Sam");
		
		System.out.println(queue.element());
		

	}

}
