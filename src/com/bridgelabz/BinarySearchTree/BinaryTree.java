package com.bridgelabz.BinarySearchTree;

public class BinaryTree<K extends Comparable<K>>  {

	class Node< k extends Comparable<K>> {
	
	K key;
	Node<K> left;
	Node<K> right;
	
	public Node(K key) {
		this.key = key;
		this.left = null;
		this.right = null;
	}

	@Override
	public String toString() {
		return "Node [key=" + key + ", left=" + left + ", right=" + right + "]";
	}
	
}

		private Node<K> root;
		
		private Node<K> addRecursively(Node<K> current, K key){
			
			if(current == null) {
				return new Node<K>(key);
			}
			
			int compareResult = key.compareTo(current.key);
			
			if(compareResult == 0)
				return current;
			if(compareResult < 0)
				current.left = addRecursively(current.left, key);
			else
				current.right = addRecursively(current.right, key);
			
			return current;
			
		}
		
		public void add(K key) {
			this.root = this.addRecursively(root, key);
		}
		
		private int getSizeRecursively(Node<K> current) {
			return current == null? 0: 1 + this.getSizeRecursively(current.left)+this.getSizeRecursively(current.right);
		}
		
		public int getSize() {
			return this.getSizeRecursively(root);
		}
		
		public void printBinaryTree() {
			System.out.println("My Tree: " + root);
		}

}
