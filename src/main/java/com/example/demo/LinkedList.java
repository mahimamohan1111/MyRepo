package com.example.demo;


class Node {

	int data;
	Node next;

	Node(){}
	Node(int d)
	{
		data = d;
		//next = null;
	}
}

class LinkedListSS {

	Node head; // head of list


	void insert(int element)
	{
		//	System.out.println(element);
		Node newNode=new Node(element);
		if (head==null)
		{
			head=newNode;
			//System.out.println("Hey:"+head.data);
		}
		else
		{
			//System.out.println("I am here");
			Node temp=head;
			while(temp.next!=null)
				temp=temp.next;

			temp.next=newNode;
			//	System.out.println(temp.data);
			//	System.out.println("Hey hey:"+temp.data);

		}
	}
	void printList()
	{
		System.out.println("My List is :");
		Node temp = head;
		while (temp != null)
		{

			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	Node MergeLL (Node ss1, Node ss2)
	{
		Node temp=new Node();
		Node tail=temp;
		while(true)
		{
			if(ss1==null)
			{
				tail.next=ss2;
				break;
			}
			if(ss2==null)
			{
				tail.next=ss1;
				break;
			}
			if(ss1.data <= ss2.data)
			{
				tail.next = ss1;
				ss1 = ss1.next;
			}
			else
			{
				tail.next = ss2;
				ss2 = ss2.next;
			}
			tail = tail.next;
		}
		return temp.next;	
	}
	public Node SortedMerge(Node A, Node B)
	{

		if(A == null) return B;
		if(B == null) return A;

		if(A.data < B.data)
		{
			A.next = SortedMerge(A.next, B);
			return A;
		}
		else
		{
			B.next = SortedMerge(A, B.next);
			return B;
		}

	}

}

public class LinkedList {
	public static void main (String args[])
	{
		LinkedListSS ss1=new LinkedListSS();
		LinkedListSS ss2=new LinkedListSS();
		ss1.insert(12);
		ss1.insert(4);
		ss1.insert(5);
		ss2.insert(9);
		ss2.insert(16);
		ss1.printList();
		ss2.printList();
		LinkedListSS mergeLL=new LinkedListSS();
		//	ss1.head=mergeLL.MergeLL(ss1.head, ss2.head);
		//ss1.printList();
		mergeLL.head=mergeLL.SortedMerge(ss1.head, ss2.head);
		mergeLL.printList();
	}

}
