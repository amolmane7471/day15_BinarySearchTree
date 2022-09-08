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
		
		bTree.printBinaryTree();
		}
}
