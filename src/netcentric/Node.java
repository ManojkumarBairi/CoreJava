package netcentric;

public class Node {

	 private Node leftChild, rightChild;
	    
	    public Node(Node leftChild, Node rightChild) {
	        this.leftChild = leftChild;
	        this.rightChild = rightChild;
	    }
	    
	    public Node getLeftChild() {
	        return this.leftChild;
	    }
	    
	    public Node getRightChild() {
	        return this.rightChild;
	    }
	    int maxDepth(Node node)  
	    { 
	        if (node == null) 
	            return 0; 
	        else 
	        { 
	            /* compute the depth of each subtree */
	            int lDepth = maxDepth(node.getLeftChild()); 
	            int rDepth = maxDepth(node.getRightChild()); 
	   
	            /* use the larger one */
	            if (lDepth > rDepth) 
	                return (lDepth + 1); 
	             else 
	                return (rDepth + 1); 
	        } 
	    } 
	    public int height() {
	        //throw new UnsupportedOperationException("Waiting to be implemented.");
	    	/*if (this == null) 
	            return 0; 
	        else 
	        { 
	             compute the depth of each subtree 
	            int lDepth = maxDepth(this.leftChild); 
	            int rDepth = maxDepth(this.rightChild); 
	        	
	        	 int lDepth =this.leftChild.height(); 
		            int rDepth = this.rightChild.height(); 
	   
	             use the larger one 
	            if (lDepth > rDepth) 
	                return (lDepth + 1); 
	             else 
	                return (rDepth + 1); 
	        } */
	    	return this.maxDepth(this)-1;
	    }

	    public static void main(String[] args) {
	        Node leaf1 = new Node(null, null);
	        Node leaf2 = new Node(null, null);
	       
	        Node node2 = new Node(leaf1, null);
	        Node node3 = new Node(leaf1, node2);
	        Node node = new Node(leaf1, node3);
	        Node root = new Node(node, leaf2);

	        System.out.println(root.height());
	    }

}
