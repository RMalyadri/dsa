package com.dsa;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
	private Entry root;

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.add(11);
		bst.add(7);
		bst.add(15);
		bst.add(6);
		bst.add(8);
		bst.add(16);
		bst.add(14);		
		bst.displayDFS(bst.root);
		bst.displayBFS(bst.root);
		System.out.println(pathSum(bst.root,24));
		
		
	}
	private static  boolean pathSum(Entry root, int targetSum) {
		if(root == null) {
			return false;
		}
		if(root.left == null && root.right == null) {
			return root.data == targetSum; 
		}
		int rem = targetSum - root.data;
		return pathSum(root.left, rem) || pathSum(root.right, rem);
	}
	
	public void displayDFS(Entry root) {
		if(root !=null) {		    
		    displayDFS(root.left);
		    System.out.println(root.data);
			displayDFS(root.right);
		
		}
				
	}

	public void displayBFS(Entry root) {
		if(root == null) {
			return;
		}
		Queue<Entry> q = new LinkedList<>();		
		q.add(root);
		while(!q.isEmpty()) {
			Entry node = q.poll();
			
			    System.out.println(node.data);
			    if(node.left != null) {
			    	q.add(node.left);
					
				}
				if(node.right != null) {
					q.add(node.right);
				}
			
				
		}
		
			
	}
	
	public void add(int data) {
		root = buildTree(root, data);
	}
	private Entry buildTree(Entry root, int data) {
	  if(root == null) {
		 root = new Entry(data);  
	  }
	  if(data < root.data) {
		 root.left = buildTree(root.left,data);
	  }else if(data > root.data) {
		root.right = buildTree(root.right,data);
	  }
	  return root;
	}
	
	

}

class Entry {
	Entry left;
	Entry right;
	int data;
	public Entry(int data) {
		this.data = data;
	}
}
