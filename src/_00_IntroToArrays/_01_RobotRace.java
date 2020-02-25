package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		
	
		//2. create an array of 5 robots.
Robot[] robots= new Robot[6];
		//3. use a for loop to initialize the robots.
for(int i=0; i<robots.length;i++) {
	robots[i]=new Robot();
}
			//4. make each robot start at the bottom of the screen, side by side, facing up

robots[0].moveTo(150,500);
robots[1].moveTo(250,500);
robots[2].moveTo(350,500);
robots[3].moveTo(450,500);
robots[4].moveTo(550,500);
robots[5].moveTo(650,500);


		//5. use another for loop to iterate through the array and make each robot move 
	    //   a random amount less than 50.
boolean raceRun=true;
while(raceRun ==  true) {
for(int i=0;i<robots.length;i++) {
    		Random r=new Random();
    		int ranNum= r.nextInt(50);
    		
    		robots[i].move(ranNum);
    	if(robots[i].getY()<=100) {
    		raceRun = false;
    		JOptionPane.showMessageDialog(null, i + " won the race!!" );
    	System.exit(0);
    		}
    	}	
}

		//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
//done above
		//7. declare that robot the winner and throw it a party!
//done above
		//8. try different races with different amounts of robots.
    	//oki
	    //9. make the robots race around a circular track.
	
	}
}
