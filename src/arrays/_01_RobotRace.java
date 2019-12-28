package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
		public static void main(String[] args) {
			Robot[] r = new Robot[5];
			Random rr = new Random();
			int random;
			boolean whetherRace=true;
			
			for(int j =0; j<r.length; j++) {
				r[j] = new Robot();
				r[j].setSpeed(10);
				r[j].setX(250+(j*100));
				r[j].setY(500);
			}
			
			while(whetherRace=true) {
				for(int i =0; i<r.length; i++) {
					random=rr.nextInt(50);
					r[i].move(random);
					if(r[i].getY()<100) {
						whetherRace=false;
					break;
					}
				}
			}
		}
	//2. create an array of 5 robots.
			
	//3. use a for loop to initialize the robots.

		//4. make each robot start at the bottom of the screen, side by side, facing up

	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.

	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
}
