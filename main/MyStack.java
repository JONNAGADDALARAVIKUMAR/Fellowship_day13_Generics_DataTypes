package main;

public class MyStack {

	private final MyLinkedList myLinkedList;
	
	public MyStack() {
		this.myLinkedList = new MyLinkedList();
	}
	
	public void push(INode myNode) {
		myLinkedList.add(myNode);
	}

	public void printMyNode() {
		myLinkedList.printMyNode();
	}

	public INode peak() {
		return myLinkedList.head;
	}

	public void clear() {
		while(myLinkedList.head != null) {
			myLinkedList.printMyNode();
			myLinkedList.pop();
		}
	}

	public boolean isEmpty() {
		return (myLinkedList.head == null);
	}
}
