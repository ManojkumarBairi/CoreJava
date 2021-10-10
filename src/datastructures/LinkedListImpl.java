package datastructures;

public class LinkedListImpl {
static Node head;
static class Node{
	int data;
	Node next;
	Node(int data)
	{
		this.data=data;
	}
}
	public static void printList()
	{
		Node d=head;
		while(null!= d)	{
			System.out.println(d.data+" ");
			d=d.next;
		}
	}

	
	public static void main(String[] args) {
		LinkedListImpl l=new LinkedListImpl();
		l.head=new Node(10);
		Node second=new Node(20);
		Node third=new Node(30);
		l.head.next=second;
		second.next=third;
		l.printList();
	}

}
