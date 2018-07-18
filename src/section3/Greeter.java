package section3;

import javax.swing.JOptionPane;

public class Greeter {
	public static void main(String[] args) {
		String name =  
		JOptionPane.showInputDialog("Please insert your name below");
		JOptionPane.showMessageDialog(null, "Hello " + name);
	}


}
