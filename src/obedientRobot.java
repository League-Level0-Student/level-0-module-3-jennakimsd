import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class obedientRobot {
	static Robot bob= new Robot();
public static void main(String[] args) {
	bob.setSpeed(10);
	bob.penDown();
	String color= JOptionPane.showInputDialog("What color would you like the shape to be?");
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
		else {
			bob.setRandomPenColor();
		}
	String shape= JOptionPane.showInputDialog("What shape do you want? (triangle, circle, or square?)");
		if (shape.equals("triangle")) {
			drawTriangle();
		}
		else if (shape.equals("circle")) {
			drawCircle();
		}
		else if (shape.equals("square")) {
			drawSquare();
		}
}

public static void drawSquare() {
	for (int i = 0; i < 4; i++) {
		bob.move(200);
		bob.turn(90);
		}
	}
public static void drawTriangle() {
	for(int i = 0; i < 3; i++) {
		bob.move(200);
		bob.turn(120);
		}
	}
public static void drawCircle() {	
	for(int i= 0; i< 360; i++) {
		bob.move(1);
		bob.turn(1);	
		}
	}


}

