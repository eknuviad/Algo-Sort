
/*The Stack class implements the use of the binary tree method in sorting file 
 * and listNode method in linking objects.
 * The class pushes names into a stack and pops them out where necessary
 */
public class Stack {
	bNode root = null;
	listNode top = null;
 
	 
	 // Method to take name argument and build the binary tree path by adding nodes
	 public void addNode2(String name) {
		if (root == null) {
			root = new bNode (name, null, null);
		} else {
			rNode(name, root);	
		}
	 }
	 
	 // Method to recursively add new nodes to root if root is not null
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
	  
	  // Method for in order traversal which calls traverse_inorder method
	 public void pop_stack() {
			traverse_inorder(root);
			pop();
			}
	  
	  // Method for in order traversal that takes the root as an argument and arranges it in order
	 //but unlike binary tree pushes the values into a push method.
	  	private void traverse_inorder(bNode root) {
	  		if (root.left!= null) traverse_inorder(root.left);
	  		push(root.name);
	  		if (root.right!= null) traverse_inorder(root.right);
	  	}		
	
	
	  	//Method to push values in stack
	public void push(String name) {
		listNode node = new listNode(name, top);
		top = node;
		}

	//Method to pop out values which recursively calls a reverse_order method.
		public void pop() {
			reverse_order(top);
			}
		
		//Method to pop out value if top is not empty
		private void reverse_order(listNode top) {
		 while (top!=null) {							//while the top of Stack is not empty
			 System.out.println(top.name);				//print the name at the node
			top = top.next;								//set the next node on top
		 	}
	
		}
}
	
	
		 
