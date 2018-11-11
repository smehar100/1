package hello;

class Node {
    public int value;
    public Node left, right;

    public Node(int value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
}

public class BinarySearchTree {
    public static boolean contains(Node root, int value) {
    	/*Node current=root;
    	while(current!=null){
    	if(current.value<value){
    		current=current.left; 
    		if(current.left.value==value){
    			return true;
    		}
    	}else{
    		current=current.right; 
    		if(current.right.value==value){
    			return true;
    		}
    		
    	}*/
    	if(root==null){
    		return false;
    	}
    	
    	if(root.value>value){
       		contains(root.left,value);
    	}
    	else if(root.left.value==value || root.right.value==value)
    		return true;
    	else
    		contains(root.right,value);
    
    	return false;
    	
    	//}
		//return false;	
       
    }
    
    public static void main(String[] args) {
        Node n1 = new Node(1, null, null);
        Node n3 = new Node(3, null, null);
        Node n2 = new Node(2, n1, n3);
        
        System.out.println(contains(n2, 3));
    }
}