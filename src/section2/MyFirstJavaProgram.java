package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	System.out.print("Hello World!");
	System.out.println("XD");
	Robot v131 = new Robot();
	v131.setSpeed(250);
	v131.penDown();
	for (int i = 0; i < 4; i++) {
	v131.move(100);	
	v131.turn(90);
	}
	
	}
}
