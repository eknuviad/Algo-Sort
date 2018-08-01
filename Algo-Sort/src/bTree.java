
// This class build a binaryTree with corresponding nodes
public class bTree {
 bNode root = null;
 
 	//Method to take name argument and build the binary tree path by adding nodes
 	public void addNode(String name) {
 		if (root == null) {
		root = new bNode (name, null, null);
	} else {
		rNode(name, root);	
	}
 }
 
 	//Method to recursively add new nodes to root if root is not null
 	private void rNode(String name, bNode node) {
	  int compared_value = node.name.toLowerCase().compareTo(name.toLowerCase());
	  
	  if (compared_value == 0) {   							// If the comparison is equal, return nothing
		  return;
	  }
	  if (compared_value > 0) {   							// If it is less than current node
		  if (node.left == null) {  					// and the left child node is not null store the value
			  node.left = new bNode(name, null, null);	
		  }else {										//If not add it to the left node
			  rNode(name, node.left);
		  }
	  } else {
		  if (node.right == null) {						// else it must be greater than the node being compared
			  node.right = new bNode(name, null,null);	//hence add it to the right node
		  }else {
			  rNode(name, node.right);
		  }	
	  }	  
  }
  
 	//Method for in order traversal which calls traverse_inorder method
 	public void inorder() {
		traverse_inorder(root);	
		}
  
  // Method for in order traversal that takes the root as an argument and arranges it in order
  		private void traverse_inorder(bNode root) {
  		if (root.left!= null) traverse_inorder(root.left);
  		System.out.println(root.name);
  		
  		if (root.right!= null) traverse_inorder(root.right);
  		
  	}	
 }
