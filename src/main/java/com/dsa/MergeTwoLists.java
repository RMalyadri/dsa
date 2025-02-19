package com.dsa;

public class MergeTwoLists {

	public static void main(String[] args) {
		Node node4 = getNode(4);
		node4.setNext(getNode(5));
		Node l1 = getNode(1);
		l1.setNext(node4);

		Node node3 = getNode(3);
		node3.setNext(getNode(4));
		Node l2 = getNode(1);
		l2.setNext(node3);
		
		Node l3 = getNode(2);
		l3.setNext(getNode(6));
		Node mergedNode = mergedNode(l1, l2);
		while(mergedNode !=null) {
			System.out.print(mergedNode.getVal()+",");
			mergedNode = mergedNode.getNext();
		}
	}

	private static Node getNode(int data) {
		return new Node(data);
	}

	private static Node mergedNode(Node l1, Node l2) {
		Node dummy = new Node(-1);
		Node current = dummy;
		while(l1!=null && l2!=null) {
			if(l1.val < l2.val) {
				current.next=l1;
				l1 = l1.next;
			}else {
				current.next=l2;
				l2 = l2.next;
			}
			current = current.next;
		}
		if(l1 != null) {
		  current.next = l1;
		}else {
		 current.next = l2;
		}
		return dummy.next;
	}

}
