package algo.interviewproblems;



public class PureStorage2 {
	public static class LinkedListNode {
		int val;
	    LinkedListNode next;
	    LinkedListNode(int node_value) {
	        val = node_value;
	        next = null;
	    }
	};
	public static void main(String[] args) {
	        int n = 3;
	        int i, item;
		int arr[]= {1,3,2,3,3};
	        LinkedListNode head = null, tail = null;
	        for(i = 0; i < arr.length; i++) { 
	            item = arr[i];
	            tail = listAdd(head, tail, item);
	            if (i == 0) {
	                head = tail;
	            }
	        }
	        printList(head);
	        System.out.println("After removinh");
	        head = removeAll(n, head);
	        printList(head);

	}
	 public static LinkedListNode listAdd(LinkedListNode head, LinkedListNode tail, int val){
	        if(head == null) {
	            head = new LinkedListNode(val);
	            tail = head;
	        } else {
	            tail.next = new LinkedListNode(val);
	            tail = tail.next;
	        }
	        return tail;
	    }
	    
	    public static void printList(LinkedListNode head) {
	        LinkedListNode iter = head;
	        while(iter != null){
	            System.out.print(iter.val + " ");
	            iter = iter.next;
	        }
	    }

	    static LinkedListNode removeAll(int n, LinkedListNode head){
	        LinkedListNode head1 = null, tail1 = null;
	    	LinkedListNode iter = head;
	    	while(iter != null){
	    		//System.out.println(iter.val);
	    		if(iter.val==n)
	    		{
	    			
	    		}else
	    		{
	    			listAdd(head1, tail1, iter.val);
	    		}
	    		iter = iter.next;
	    	}
	    	printList(head1);
	    	return head1;

	    }
}
