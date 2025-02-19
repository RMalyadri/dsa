package com.dsa;

import java.util.LinkedList;
import java.util.Queue;

public class NodeRightPointer {

	public static void main(String[] args) {
		Node root = null;
		NodeRightPointer np = new NodeRightPointer();
		root = np.contructNode();
		Node newRoot = np.connect(root);
		System.out.println(newRoot.getLeft().getNext().getNext());
		

	}
	 public Node connect(Node root) {
	     if(root == null) {
	    	 return root;
	     }
	     Queue<Node> nodeQueue = new LinkedList<>();
	     nodeQueue.add(root);
	     while(!nodeQueue.isEmpty()) {
	    	 int size = nodeQueue.size();
	    	 for(int i=0;i<size;i++) {
	    		 Node currentNode = nodeQueue.peek();
	    		 nodeQueue.poll();
	    		 if(i == size -1) {
	    			 currentNode.next = null;
	    		 }else {
	    			 currentNode.next =  nodeQueue.peek();
	    		 }
	    		 if(currentNode.left != null) {
		    		 nodeQueue.add(currentNode.left);
		    	 }
		    	 if(currentNode.right != null) {
		    		 nodeQueue.add(currentNode.right);
		    	 }
	    	 }	    	 
	     }
	     return root;
	     
	 }
	 
     private Node contructNode() { 
    	 Node nodFour = new Node(4);
    	 Node nodFive = new Node(5);
    	 Node nodTwo = new Node(2,nodFour,nodFive,null);
    	 
    	 Node nodSix = new Node(6);
    	 Node nodSev = new Node(7);
    	 Node nodThree = new Node(3,nodSix,nodSev,null);
    	 
    	 return new Node(1,nodTwo,nodThree,null);    	 
    	
     }	  

}




