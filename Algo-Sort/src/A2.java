
import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
/** 
 * This program reads a specified text file and echos it to standard
 * display. The names which are read are then arranged in ascending and 
 * descending order
 *
 */

public class A2 {
	@SuppressWarnings("resource")
	
	public static void main(String args[]) {
		
// Prompt user for a file name.  If no name is entered, terminate
// the program, otherwise attempt to open the file. If file open
// is not successful, prompt again for a new name.  Keep doing this
// until successful open, or a blank line is entered.
		
	System.out.println("Assignment 2 - File Sorting Program");
		Scanner sc = new Scanner(System.in);
		BufferedReader rd = null;
		
		while(rd == null) {
			System.out.print("Enter name of file to sort: ");
			String filename = sc.nextLine();
			if (filename.equals("")) {
				System.out.println("Program terminated");
				System.exit(0);									// Exit
			}
// Try to open the specified file
			try {
				rd = new BufferedReader(new FileReader(filename));
			}
			catch (IOException ex) {
				System.out.println("Unable to open file, try again.");
			}
		}

// Read the file a line at a time into a string.  Print as read to the output display.
// Modify the code below as necessary.
		
		System.out.println("");
		try {
			bTree line_data = new bTree();
			Stack line_data2 = new Stack();
			while (true) {
			
				String line = rd.readLine();							// Read a line of text			  
				if (line == null) break;								// Exit if at end of file	
				line_data.addNode(line);
				line_data2.addNode2(line);
				}
			System.out.println("File in sort order:");
			System.out.println("");
			line_data.inorder();										//sort the names using bTree and print
			System.out.println("");
			System.out.println("");
			System.out.println("File in reverse sort order:");
			System.out.println("");
			System.out.println("");
			line_data2.pop_stack();										//push names using stack and pop
	
		}
		catch (IOException ex) {
			System.out.println("I/O Error - program terminated");
			System.exit(-1);
		}
					
		System.out.println("\n\nProgram terminated"); 
	
        
	
	}
        
}