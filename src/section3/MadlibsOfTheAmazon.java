package section3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	
	public static void main(String[] args) {
		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's how to do it...
		JOptionPane.showMessageDialog(null, "If you find yourself having to cross a piranha-infested river, here's how to do it...");
		// Get the user to enter an adjective
		String a =
		JOptionPane.showInputDialog("Enter an adjective in the box below");
		// Get the user to enter a type of liquid
		String b =
		JOptionPane.showInputDialog("Enter a type of liquid in the box below");
		// Get the user to enter a body part
		String c =
		JOptionPane.showInputDialog("Enter a body part in the box below");
		// Get the user to enter a verb
		String d =
		JOptionPane.showInputDialog("Enter a verb in the box below");
		// Get the user to enter a place
		String e =
		JOptionPane.showInputDialog("Enter a place in the box below");
		// Fit the user's words into this sentence, and save it in a String:
		// Piranhas are more [adjective] during the day, so cross the river at
		// night. Piranhas are attracted to fresh [type of liquid] and will most
		// likely take a bite out of your [body part] if you [verb]. Whatever
		// you do, if you have an open wound, try to find another way to get
		// back to the [place]. Good luck!
		JOptionPane.showMessageDialog(null, "Piranhas are more " + a 
				+ " during the day, so cross the at night. Piranhas are attracted to fresh " + b 
				+ " and will most likely take a bite out of your " + c 
				+ " if you " + d 
				+ ". Whatever you do, if you have an open wound, try to find another way to get back to the " + e 
				+ ". Good luck!");
				
				
		
		// Make a pop-up for the final story. You can use \n to go to the next line
		

	}
}

