package section3;

import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
		JOptionPane.showMessageDialog(null, "Answer the following question, (yes) or (no)");
		String o = JOptionPane.showInputDialog("Do you know how to code?");
		// 2. If they say "yes", tell them they will rule the world.
		if(o.equals("yes")) {JOptionPane.showMessageDialog(null, "You Will Rule The World!!!");}
		// 3. Otherwise, wish them good luck washing dishes.
		else if(o.equals("no")) {JOptionPane.showMessageDialog(null, "Good luck washing dishes;)");
	}
}
}

