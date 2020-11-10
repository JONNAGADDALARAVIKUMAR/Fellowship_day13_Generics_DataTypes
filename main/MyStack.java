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

}
