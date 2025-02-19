package com.dsa;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeMultipleLinkedLists {
	private static PriorityQueue<Node> orderNodes =
			new PriorityQueue<>(Comparator.comparingInt(Node::getVal));

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
		Node mergedNode = mergedNode(new Node[] { l1, l2,l3});
		while(mergedNode !=null) {
			System.out.print(mergedNode.getVal()+",");
			mergedNode = mergedNode.getNext();
		}
	}

	private static Node getNode(int data) {
		return new Node(data);
	}

	private static Node mergedNode(Node[] nodes) {
		for (Node node : nodes) {
			orderNodes.add(node);
		}
		Node dummy = new Node();
		Node current = dummy;
		while (!orderNodes.isEmpty()) {
			Node node = orderNodes.poll();
			current.next = node;
			current = current.next;
			if (node.next != null) {
				orderNodes.add(node.next);
			}
		}
		return dummy.next;
	}

}
