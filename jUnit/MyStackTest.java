package jUnit;

import org.junit.Assert;
import org.junit.Test;
import main.INode;
import main.MyNode;
import main.MyStack;

public class MyStackTest {

	@Test
	public void given3NumbersAddedToStackAndLastAddedNodeShouldBePeek() {
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		
		MyStack myStack = new MyStack();
		
		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);
		myStack.printMyNode();
		INode result = myStack.peak();
		Assert.assertEquals(myThirdNode, result);
	}

	@Test
	public void given3NumbersAddedToStackAndPopUntillStackGetEmpty() {
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		
		MyStack myStack = new MyStack();
		
		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);
		System.out.println("Stack Clearing");
		myStack.clear();
		boolean result = myStack.isEmpty();
		Assert.assertTrue(result);
	}

}
