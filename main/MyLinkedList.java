package main;

@SuppressWarnings({ "unchecked", "rawtypes" })
public class MyLinkedList {
	
	public INode head;
	public INode tail;

	public MyLinkedList() {
		this.head = null;
		this.tail = null;
	}

	public void add(INode newNode) {
		
		if(this.tail == null) {
			this.tail = newNode;
		}
		if(this.head == null) {
			this.head = newNode;
		} 
		else {
			INode tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);
		}
	}
	public void append(INode myNode) {
			
		if(this.tail == null) {
			this.tail = myNode;
		}
		if(this.head == null) {
			this.head = myNode;
		} 
		else {
			this.tail.setNext(myNode);
			this.tail = myNode;
		}
	}
	
	public void insert(INode myNode, INode newNode) {
		INode tempNode = myNode.getNext();
		myNode.setNext(newNode);
		newNode.setNext(tempNode);
	}
	
	public INode pop() {
		
		INode tempNode = this.head;
		this.head = head.getNext();
		return tempNode;
	}
	
	public INode popLast() {
		
		INode tempNode = this.head;
		while(!tempNode.getNext().equals(tail)) {
			tempNode = tempNode.getNext();
		}
		this.tail = tempNode;
		tempNode = tempNode.getNext();
		return tempNode;	
	}
	
	public INode search(INode newNodeToSearch) {
		INode tempNode = this.head;
		while(!tempNode.getNext().equals(newNodeToSearch)) {
			tempNode = tempNode.getNext();
		}
		tempNode = tempNode.getNext();
		return tempNode;
	}
	
	public void printMyNode() { //Prints the List like 56->30->70 by appending
		StringBuffer myNodes = new StringBuffer("My Nodes : ");
		INode tempNode = head;
		while(tempNode.getNext() != null) {
			myNodes.append(tempNode.getKey());
			if(!tempNode.equals(tail)) {
				myNodes.append("->");
			}
				tempNode = tempNode.getNext();
		}
		myNodes.append(tempNode.getKey());
		System.out.println(myNodes);
	}
	
	public void printMyNodePopLast() { //Prints the List like 56->30->70 by appending
		StringBuffer myNodes = new StringBuffer("My Nodes : ");
		INode tempNode = head;
		while(tempNode.getNext() != null) {
			myNodes.append(tempNode.getKey());
			if(!tempNode.equals(tail)) {
				myNodes.append("->");
			}
				tempNode = tempNode.getNext();
		}
		System.out.println(myNodes);
	}
}
