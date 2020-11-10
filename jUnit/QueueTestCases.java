package jUnit;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import main.INode;
import main.MyLinkedList;
import main.MyNode;
import main.MyQueue;
import main.MyStack;

public class QueueTestCases {
	@Test
	public void given3NumbersAddedToQueue() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		
		MyQueue myQueue = new MyQueue();
		
		myQueue.enque(myFirstNode);
		myQueue.enque(mySecondNode);
		myQueue.enque(myThirdNode);
		
		myQueue.printMyNode();
		boolean result = myFirstNode.getNext().equals(mySecondNode) && mySecondNode.getNext().equals(myThirdNode);
		Assert.assertTrue(result);
	}
	
	@Test
	public void given3NumbersAddedToQueueAndRemovedByDeQue() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		
		MyQueue myQueue = new MyQueue();
		
		myQueue.enque(myFirstNode);
		myQueue.enque(mySecondNode);
		myQueue.enque(myThirdNode);
		
		INode result = myQueue.deQue();
		myQueue.printMyNode();
		Assert.assertEquals(myFirstNode, result);
	}
}
