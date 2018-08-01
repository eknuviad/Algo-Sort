
/*The bNode class keeps track of the following pieces of data about 
 * a node on the bTree: name, left child, right child
 * this information is public and can be used in different classes
 * in the package A2
 */
public class bNode {
 String name;
 bNode left;
 bNode right;

 //This creates a bNode object with a specified name, left and right child
 	public bNode(String name, bNode left, bNode right ) {
 		this.name = name;
 		this.left = left;
 		this.right = right;
	 
 	}
}