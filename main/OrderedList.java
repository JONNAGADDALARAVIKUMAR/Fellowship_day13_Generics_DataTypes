package main;

public class OrderedList<K extends Comparable<K>> {
	
	public INode<K> head;
	public INode<K> tail;
	
	public OrderedList() {
		this.head = null;
		this.tail = null;
	}
	
	public boolean isEmpty() {
		if(this.tail == null && this.head == null) {
			return true;
		}
		return false;
	}
	
	public void add(INode<K> newNode) {
		if(this.tail == null) {
			this.tail = newNode;
			
		}
		if(this.head == null) {
			this.head = newNode;
		} 
		else if(newNode.getKey().compareTo(this.tail.getKey()) >= 0) {
			this.tail.setNext(newNode);
			this.tail = newNode;
		}
		else if(newNode.getKey().compareTo(this.head.getKey()) <= 0) {
			INode<K> tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);
		}
		else {
			INode<K> tempNode = this.head;
			while(newNode.getKey().compareTo((K) tempNode.getNext().getKey()) >= 0) {
				tempNode = tempNode.getNext();
			}
			newNode.setNext(tempNode.getNext());
			tempNode.setNext(newNode);
		}
	}
	
	public void printNodes() {
		StringBuffer myNodes = new StringBuffer("My Nodes : ");
		if(isEmpty()) {
			return;
		}
		INode<K> tempNode = this.head;
		while(tempNode.getNext() != null) {
			myNodes.append(tempNode.getKey());
			if(!tempNode.equals(this.tail)) {
				myNodes.append("->");
			}
			tempNode = tempNode.getNext();
		}
		myNodes.append(tempNode.getKey());
		System.out.println(myNodes);
	}
}
