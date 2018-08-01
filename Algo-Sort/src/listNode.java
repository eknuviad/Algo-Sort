
/*The listNode class keeps track of the following pieces of data about 
 * a node in the list: name, address of next listNode.
 * this information is public and can be used in different classes
 * in the package A2
 */
public class listNode {
	String name;
	listNode next;

// Method creates a new listNode with specified name and address of next listNode
	 public listNode(String name, listNode next) {
		 this.name = name;
		 this.next = next;
	 }
}