package com.bridgelabz.BinarySearchTree;
/*
 * purpose : Ability to create a BST by adding 56 and then adding 30 & 70 , Use INode to create My Binary
 * @uthor : Amol
 * since : 2022/09/08
 */
public class BinaryTreeMain {
	public static void main(String[] args) {
		System.out.println("------ Welcome to Data Structure : Binary Search Tree ------");	
		
		BinaryTree<Integer> bTree = new BinaryTree<Integer>();
		bTree.add(56);
		bTree.add(30);
		bTree.add(70);
		bTree.add(22);
		bTree.add(60);
		bTree.add(40);
		bTree.add(95);
		bTree.add(65);
		bTree.add(11);
		bTree.add(3);
		bTree.add(16);
		bTree.add(63);
		bTree.add(67);
		
		bTree.printBinaryTree();
		System.out.println("The Size of the Binary Tree is : "+bTree.getSize());
		System.out.println("element present in the Binary Search Tree : " +bTree.searchTree(63));
	
	}

}
