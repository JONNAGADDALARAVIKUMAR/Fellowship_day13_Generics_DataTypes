package jUnit;

import org.junit.Assert;
import org.junit.Test;
import main.MyNode;
import main.MyLinkedList;

public class MyNodeTest {
	
	@Test
	public void shouldPassThisTestWhenPassingThreeValuesToLinkedList() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		
		myFirstNode.setNext(mySecondNode);
		mySecondNode.setNext(myThirdNode);
		
		boolean result = myFirstNode.getNext().equals(mySecondNode)
				&& mySecondNode.getNext().equals(myThirdNode);
		Assert.assertTrue(result);
	}
	
	@Test
	public void shouldPassThisTestWhenAddingThreeValuesToLinkedList() {
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		
		MyLinkedList myLinkedList = new MyLinkedList();
		
		myLinkedList.add(myFirstNode);
		myLinkedList.add(mySecondNode);
		myLinkedList.add(myThirdNode);
		
		myLinkedList.printMyNode();
		boolean result = myLinkedList.head.equals(myThirdNode) &&
							myLinkedList.head.getNext().equals(mySecondNode) &&
							myLinkedList.tail.equals(myFirstNode);
		Assert.assertTrue(result);
	}
	
	@Test
	public void shouldPassThisTestWhenAppendingThreeValuesToLinkedList() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		
		MyLinkedList myLinkedList = new MyLinkedList();
		
		myLinkedList.add(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		
		myLinkedList.printMyNode();
		boolean result = myLinkedList.head.equals(myFirstNode) &&
							myLinkedList.head.getNext().equals(mySecondNode) &&
							myLinkedList.tail.equals(myThirdNode);
		Assert.assertTrue(result);
	}
}	