package com.binarysearchtree;


import org.junit.Assert;
import org.junit.Test;

public class MyBinaryTest {

	@Test
	public void given3NumbersWhenAddedToBinaryShouldReturnSizeThree() {
		MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
		myBinaryTree.add(56);
		//left subtree
		{myBinaryTree.add(30);
		{myBinaryTree.add(22);
		{myBinaryTree.add(11);
		myBinaryTree.add(3);
		myBinaryTree.add(16);}}
		myBinaryTree.add(40);}
		//Right subtree
		{myBinaryTree.add(70);
		{myBinaryTree.add(60);
		{myBinaryTree.add(65);
		myBinaryTree.add(63);
		myBinaryTree.add(67);}}
		myBinaryTree.add(95);}
		
		int size = myBinaryTree.getSize();
		//Assert.assertEquals(13, size);
		Assert.assertTrue(myBinaryTree.search(40));
	}
}