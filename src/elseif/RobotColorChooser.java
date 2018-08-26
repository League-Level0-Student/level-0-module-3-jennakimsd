//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot bob= new Robot();
		//3. Ask the user what color they would like the robot to draw
		for(int i=0;i<10;i++) {
		String color=JOptionPane.showInputDialog("What color would you like the robot to draw?");
		//5. Use an if/else statement to set the pen color that the user requested
if (color.equals("pink")) {
	bob.setPenColor(Color.pink);
}
else if(color.equals("cyan")) {
	bob.setPenColor(Color.cyan);
}
else if (color.equals("green")) {
	bob.setPenColor(Color.green);
}
else if (color.equals("magenta")) {
	bob.setPenColor(Color.magenta);
}

        //6. If the user doesn’t enter anything, choose a random color
else {
	bob.setRandomPenColor();
}
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		bob.setPenWidth(10);
	    //2. Make the robot draw a shape (this will take more than one line of code)
		bob.penDown();
		for(int p=0;p<4;p++) {
			bob.setSpeed(20);
			bob.move(100);
			bob.turn(90);}}


	}
}
