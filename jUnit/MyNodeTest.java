package jUnit;

import org.junit.Assert;
import org.junit.Test;

import main.INode;
import main.MyLinkedList;
import main.MyNode;
import main.OrderedList;

public class MyNodeTest {
	
	@Test
	//Simple Linked List
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
	//Adding Values to the Linked List
	public void shouldPassThisTestWhenAddingThreeValuesToLinkedList() {
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		
		MyLinkedList myLinkedList = new MyLinkedList();
		
		myLinkedList.add(myFirstNode);
		myLinkedList.add(mySecondNode);
		myLinkedList.add(myThirdNode);
		
		System.out.print("Adding\t\t- ");
		myLinkedList.printMyNode();
		boolean result = myLinkedList.head.equals(myThirdNode) &&
							myLinkedList.head.getNext().equals(mySecondNode) &&
							myLinkedList.tail.equals(myFirstNode);
		Assert.assertTrue(result);
	}
	
	@Test
	//Appending Nodes to the Linked List
	public void shouldPassThisTestWhenAppendingThreeValuesToLinkedList() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		
		MyLinkedList myLinkedList = new MyLinkedList();
		
		myLinkedList.add(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		
		System.out.print("Append\t\t- ");
		myLinkedList.printMyNode();
		boolean result = myLinkedList.head.equals(myFirstNode) &&
							myLinkedList.head.getNext().equals(mySecondNode) &&
							myLinkedList.tail.equals(myThirdNode);
		Assert.assertTrue(result);
	}
	
	@Test
	//Inserting Nodes at Specified Position
	public void shouldPassThisTestWhenInsertOneValueToLinkedList() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		
		MyLinkedList myLinkedList = new MyLinkedList();
		
		myLinkedList.add(myFirstNode);
		myLinkedList.append(myThirdNode);
		myLinkedList.insert(myFirstNode, mySecondNode);
		
		System.out.print("Insert\t\t- ");
		myLinkedList.printMyNode();
		boolean result = myLinkedList.head.equals(myFirstNode) &&
							myLinkedList.head.getNext().equals(mySecondNode) &&
							myLinkedList.tail.equals(myThirdNode);
		Assert.assertTrue(result);
	}
	
	@Test
	//Deleting First Node
	public void shouldPassThisTestWhenFirstValueDeletedFromLinkedList() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		
		MyLinkedList myLinkedList = new MyLinkedList();
		
		myLinkedList.add(myFirstNode);
		myLinkedList.append(myThirdNode);
		myLinkedList.insert(myFirstNode, mySecondNode);
		
		INode result = myLinkedList.pop();
		System.out.print("PopFirst\t- ");
		myLinkedList.printMyNode();
		Assert.assertEquals(myFirstNode, result);
	}
	
	@Test
	//Deleting Last Node
	public void shouldPassThisTestWhenLastValueDeletedFromLinkedList() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		
		MyLinkedList myLinkedList = new MyLinkedList();
		
		myLinkedList.add(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		
		INode result = myLinkedList.popLast();
		System.out.print("PopLast\t\t- ");
		myLinkedList.printMyNodePopLast();
		Assert.assertEquals(myThirdNode, result);
	}
	
	@Test
	//Searching for a Particular Node
	public void shouldPassThisTestANodeIfPresentLinkedList() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		
		MyLinkedList myLinkedList = new MyLinkedList();
		
		myLinkedList.add(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		
		INode result = myLinkedList.search(mySecondNode);
		System.out.print("Search\t\t- ");
		myLinkedList.printMyNode();
		Assert.assertEquals(mySecondNode, result);
	}
	
	@Test
	//Inserting a Node after Particular Node
	public void shouldPassThisTestWhenOneValueInsertedAfterSpecifiedValueLinkedList() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyNode<Integer> insertionNode = new MyNode<>(40);
		
		MyLinkedList myLinkedList = new MyLinkedList();
		
		myLinkedList.add(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		
		boolean result = myLinkedList.insertNodeAfterSpecifiedNode(insertionNode, mySecondNode);
		System.out.print("Insert After\t- ");
		myLinkedList.printMyNode();
		Assert.assertTrue(result);
	}
	
	@Test
	//Deleting Node after Particular Node
	public void shouldPassThisTestWhenSpecifiedNodeIsDeletedLinkedList() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(40);
		MyNode<Integer> myForthNode = new MyNode<>(70);
		
		MyLinkedList myLinkedList = new MyLinkedList();
		
		myLinkedList.add(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		myLinkedList.append(myForthNode);
		
		myLinkedList.deleteNodeAfterSpecifiedNode(myThirdNode, mySecondNode);
		System.out.print("Delete After\t- ");
		myLinkedList.printMyNode();
		boolean result = myLinkedList.head.getNext().getNext().equals(myForthNode);
		Assert.assertTrue(result);
	}
	
	@Test
	//Sorting Node after Particular Node
	public void shouldPassThisTestWhenThisOrderedListSorted() {
		
		MyNode<Integer> firstNode = new MyNode<>(56);
		MyNode<Integer> secondNode = new MyNode<>(30);
		MyNode<Integer> thirdNode = new MyNode<>(40);
		MyNode<Integer> fourthNode = new MyNode<>(70);
		
		OrderedList<Integer> orderedList = new OrderedList<>();
		
		orderedList.add(firstNode);
		orderedList.add(secondNode);
		orderedList.add(thirdNode);
		orderedList.add(fourthNode);
		System.out.print("Sorting\t\t- ");
		orderedList.printNodes();
		boolean result = orderedList.head.equals(secondNode) &&
						orderedList.head.getNext().equals(thirdNode) &&
						orderedList.head.getNext().getNext().equals(firstNode) &&
						orderedList.tail.equals(fourthNode);
		Assert.assertTrue(result);
	}
}	