package section5;

import java.applet.AudioClip;
import java.awt.Dimension;

import java.awt.Graphics;
import java.awt.Robot;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class ScaryMaze extends JPanel implements Runnable, MouseMotionListener {
	
	BufferedImage maze;
	final int frameWidth = 800;
	final int frameHeight = 600;

	ScaryMaze() throws Exception {
		//1. Use this online tool to make a maze image and drop it into your section5 package: http://pixlr.com/editor/
		maze = ImageIO.read(getClass().getResource("maze.jpg"));
		//2. Change the line of code above so that it matches your maze's file name
		
		//3. Set the mouse pointer to the start of your maze using:
		new Robot().mouseMove(555, 200);
		
		//4. Add a mouse motion listener using:
		addMouseMotionListener(this);
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		int mouseX = e.getX();
		int mouseY = e.getY();
		int mouseColor = maze.getRGB(mouseX, mouseY);
		//5. Print the mouseColor variable 
		System.out.println(mouseColor);
		//6.  Run your program and put your mouse over the background to find out what color it is
		//7. Create an int variable that holds the background color. 
		int backgroundColor = -4134803;
		int lineColor = -16777216;
		//8. If the mouse falls off the path (if it is on the background)
		if(mouseColor == backgroundColor) {
		scare();
		}
		if(mouseColor == lineColor) {
		scare();
		}
				// call the scare method
		
		//13. If the mouse is on the end color
		int endColor = -7711074;
				// pop up a message to tell them they won
		if(mouseColor == endColor) {
		JOptionPane.showMessageDialog(null, "YOU WIN!!!");
		}
	}

	private void scare() {
		System.out.println("BOO!");
		//9. Find a scary sound and put it in the section5 package where you put your maze picture. You can find a sound on freesound.org. Log in as leagueofamazing/code4life.
		
		//10. Use the code below to load your sound.  Change the file name to match the name of your sound file.  
		AudioClip sound = JApplet.newAudioClip(getClass().getResource("62386__fons__eng-1.wav"));
		
		//11. Play the scary sound. Hint: type "sound" and then a period.		
		sound.play();
		//12. Drop an image into your section5 package, and use the showScaryImage method to scare your victim!
		
		String imagename = "Scary_Wallpaper_039.jpg";
		showScaryImage(imagename);
	}

	private void showScaryImage(String imageName) {
		try {
			maze = ImageIO.read(getClass().getResource(imageName));
		} catch (Exception e) {
			System.err.println("Couldn't find this image: " + imageName);
		}
		repaint();
	}

	public static void main(String[] args) throws Exception {
		SwingUtilities.invokeLater(new ScaryMaze());
	}

	@Override
	public void run() {
		JFrame frame = new JFrame("Scary Maze");
		frame.add(this);
		setPreferredSize(new Dimension(frameWidth, frameHeight));
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setVisible(true);
	}

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(maze, 0, 0, null);
	}

	@Override
	public void mouseDragged(MouseEvent e) {}

}



