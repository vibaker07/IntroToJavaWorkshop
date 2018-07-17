package section2;

import org.jointheleague.graphical.robot.Robot;

public class TriangleShell {

	// 1. Create a new Robot
	Robot hi80 = new Robot();

	
	void go() {

		hi80.hide();
		hi80.penDown();
		// 6. Make the robot go as fast as possible
		hi80.setSpeed(500);
		// 4. make a variable to hold the length of the triangle and set it to 50
		int length = 50;
		// 7. Use a for loop to repeat steps #9 to #10, 60 times
		for(int i = 0; i < 60; i++) {
			// 9. Change the color of the pen to a random color
			hi80.setRandomPenColor();
			// 8. Increase the length variable by 10
			length = length + 10;
			// 5. call your drawTriangle() method using your length variable
			drawTriangle(length);
			// 10. Turn the robot 6 degrees to the right
			hi80.turn(6); }
	}

	/* 2. fill in the method below to draw a triangle. Use the length variable when you call move(). */
	private void drawTriangle(int length) {
		for(int i = 0; i < 3; i++) {
		hi80.move(length);
		hi80.turn(120);
		}
		
		
		
		
		
	}

	
	public static void main(String[] args) {
		new TriangleShell().go();
	}
}
