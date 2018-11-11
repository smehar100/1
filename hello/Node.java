package hello;

import java.util.LinkedList;
import java.util.Queue;

class Node 
{
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

	    public int height() {
	    	Queue<Node> q = new LinkedList<Node>();
			int height = 0;
			// add root to the queue
			q.add(this);
			// add null as marker
			q.add(null);
			while (q.isEmpty() == false) {
				Node n = q.remove();
				// check if n is null, if yes, we have reached to the end of the
				// current level, increment the height by 1, and add the another
				// null as marker for next level
				if (n == null) {
					// before adding null, check if queue is empty, which means we
					// have traveled all the levels
					if(!q.isEmpty()){
						q.add(null);
					}
					height++;
				}else{
					// else add the children of extracted node.
					if (this.getLeftChild() != null) {
						q.add(this.getLeftChild());
					}
					if (n.getRightChild() != null) {
						q.add(n.getRightChild());
					}
				}
			}
			return height;
	    }
	    
	    public static void main(String[] args) {
	        Node leaf1 = new Node(null, null);
	        Node leaf2 = new Node(null, null);
	        Node node = new Node(leaf1, null);
	        Node root = new Node(node, leaf2);

	        System.out.println(root.height());
	    

	    }


}

/*class BinaryTree 
{
	Node root;

	 Compute the "maxDepth" of a tree -- the number of 
	nodes along the longest path from the root node 
	down to the farthest leaf node.
	
	
	 Driver program to test above functions 
	public static void main(String[] args) 
	{
		BinaryTree tree = new BinaryTree();

		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);

		System.out.println("Height of tree is : " + 
									tree.maxDepth(tree.root));
	}
}*/