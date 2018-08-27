import org.jointheleague.graphical.robot.Robot;

public class obedientRobot {
public static void main(String[] args) {
	}
static Robot bob= new Robot();
public static void drawSquare() {
	for (int i = 0; i < 4; i++) {
		bob.penDown();
		bob.move(100);
		bob.turn(90);}
	}

}
