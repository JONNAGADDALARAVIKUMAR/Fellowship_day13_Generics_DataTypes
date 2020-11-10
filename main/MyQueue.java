package main;

public class MyQueue {

	private final MyLinkedList myLinkedList;
	
	public MyQueue() {
		this.myLinkedList = new MyLinkedList();
	}

	public void enque(MyNode newNode) {
		myLinkedList.append(newNode);
	}

	public void printMyNode() {
		myLinkedList.printMyNode();
	}

	public INode deQue() {
		return myLinkedList.pop();		
	}
}
