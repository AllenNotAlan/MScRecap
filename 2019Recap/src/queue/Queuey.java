package queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Queuey {
	
	LinkedList queue = new LinkedList();
	
	/**
	 * constructor
	 * 
	 * Making a queue
	 */
	public Queuey() {
		queue = new LinkedList();
	}
	
	/**
	 * returns true if linkedList is empty
	 * @return
	 */
	public boolean isEmpty() {
		//if linkedList is empty then isEmpty() will return is empty.
		return queue.isEmpty();	
	}
	
	/**
	 * returns size of queue.
	 * @return
	 */
	public int size() {
		return queue.size();
	}
	
	//enqueue an item.
	public void enqueue(String n) {
		queue.addLast(n);
	}
	
	//dequeue an item
	public String dequeue() {
		return (String)queue.remove(0);
	}
	
	//peek at  the first item
	public String peek() {
		return (String)queue.get(0);
	}
	
	public static void main(String[] args) {
		
//		Queuey numberQueue = new Queuey();
//		numberQueue.enqueue(5);
//		numberQueue.enqueue(7);
//		numberQueue.enqueue(6);
//		
//		System.out.println("First out: " + numberQueue.dequeue());
//		System.out.println("Peek at second item:"+numberQueue.peek());
//		System.out.println("Second out: "+ numberQueue.dequeue());
//		System.out.println("Third out: "+ numberQueue.dequeue());
		
//		Queuey stringQueue = new Queuey();
//		stringQueue.enqueue("hi");
//		stringQueue.enqueue("There");
//		System.out.println(stringQueue.dequeue() + " ");
//		System.out.println(stringQueue.dequeue() + " ");
//		
//		if(stringQueue.isEmpty()) {
//			System.out.println("Queue is empty.");
//		} else {
//			System.out.println("Queue is NOT empty.");
//		}
		
		Stack<String> stacky = new Stack<>();
		stacky.push("there");
		stacky.push("hi");
		System.out.println(stacky.pop());
		System.out.println(stacky.pop());
		
		
		
		
		
	}
}
